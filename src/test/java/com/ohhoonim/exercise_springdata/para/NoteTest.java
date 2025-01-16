package com.ohhoonim.exercise_springdata.para;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Set;
import java.util.UUID;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ohhoonim.exercise_springdata.para.port.NotePort;
import com.ohhoonim.exercise_springdata.para.port.ProjectPort;
import com.ohhoonim.exercise_springdata.para.port.ShelfPort;
import com.ohhoonim.exercise_springdata.para.port.TagPort;
import com.ohhoonim.exercise_springdata.para.service.NoteService;
import com.ohhoonim.exercise_springdata.para.service.TagService;

@ExtendWith(MockitoExtension.class)
public class NoteTest {
   
    @InjectMocks
    NoteService noteService;

    @Mock NotePort notePort;
    @Mock ProjectPort projectPort;
    @Mock ShelfPort shelfPort;


    @Test
    @DisplayName("노트 만들고 수정하기")
    public void makeNoteTest() {
        var title = "first note";
        var contents =  "new contents";
        var notSaveNote = new Note(null, title, contents);

        // 새로운 노트 작성 
        var noteId = UUID.randomUUID();
        var newNote = new Note(noteId, "first note", "new contents");
        when(notePort.newNote(any())).thenReturn(newNote);

        Note savedNote = noteService.newNote(notSaveNote);
        assertThat(savedNote.noteId()).isEqualTo(noteId);

        // 노트를 열어서 제목, 내용 수정
        when(notePort.getNote(any())).thenReturn(savedNote);

        Note old = noteService.getNote(noteId);
        var newTitle = "new " + title;
        var newContents = "new " + contents;
        var modifiedNote = new Note(old.noteId(), newTitle, newContents);

        assertThat(modifiedNote.title()).isEqualTo("new first note");
        verify(notePort, times(1)).getNote(any());
    }

    @InjectMocks
    TagService tagService;    

    @Mock
    TagPort tagPort;

    @Test
    @DisplayName("노트에 tag 추가하기")
    public void addTagTest() {
        // search tag --> tagService
        Set<Tag> searchedTags = Set.of(
                new Tag(1L, "java"), 
                new Tag(2L, "javascript"));
        when(tagPort.findTags(any(), any())).thenReturn(searchedTags);

        Set<Tag> tagList = tagService.findTagsLimit20PerPage("java", null);

        assertThat(tagList.size()).isEqualTo(2);
        verify(tagPort, times(1)).findTags(any(), any());

        // add tag  int note
        var searchedTag = new Tag(1L, "java");

        UUID noteId = UUID.randomUUID();

        when(tagPort.tagsInNote(any())).thenReturn(Set.of(new Tag(1L, "java")));

        Set<Tag> tags = noteService.addTag(noteId, searchedTag);

        assertThat(tags.size()).isEqualTo(1);

        verify(tagPort, times(1)).addTagInNote(any(), any());
        verify(tagPort, times(1)).tagsInNote(any());
    }

    @Test
    @DisplayName("노트 para 분류하기 - project 추가")
    public void addProjectTest() {
        // search project
        // add project
    }

    @Test
    @DisplayName("노트 para 분류하기 - area, resource, archive ")
    public void classifyNoteTest() {
        // search shelves 
        // add shelf
    }



/*
```plantuml
@startuml
skinparam monochrome reverse
start
:create new note;
:input title, contents<
if (none classify) then 
else
    fork
        :add project to note|
    fork again
        :add shelf to note|
    fork again
        :add tag|
    endfork
endif
:save note/
stop
@enduml
```
*/    













}
