package com.ohhoonim.exercise_springdata.para.service;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ohhoonim.exercise_springdata.para.Note;
import com.ohhoonim.exercise_springdata.para.Note.Usecase;
import com.ohhoonim.exercise_springdata.para.Para;
import com.ohhoonim.exercise_springdata.para.Para.Project;
import com.ohhoonim.exercise_springdata.para.Para.Shelf.Archive;
import com.ohhoonim.exercise_springdata.para.Para.Shelf.Area;
import com.ohhoonim.exercise_springdata.para.Para.Shelf.Resource;
import com.ohhoonim.exercise_springdata.para.Tag;
import com.ohhoonim.exercise_springdata.para.port.NotePort;
import com.ohhoonim.exercise_springdata.para.port.ProjectPort;
import com.ohhoonim.exercise_springdata.para.port.ShelfPort;
import com.ohhoonim.exercise_springdata.para.port.TagPort;

@Service
public class NoteService implements Usecase {

    private final NotePort notePort;
    private final ProjectPort projectPort;
    private final ShelfPort shelfPort;
    private final TagPort tagPort;

    public NoteService(NotePort notePort,
            ProjectPort projectPort,
            ShelfPort shelfPort,
            TagPort tagPort ) {
        this.notePort = notePort;
        this.projectPort = projectPort;
        this.shelfPort = shelfPort;
        this.tagPort = tagPort;
    }

    @Override
    public List<Project> projects(UUID noteId) {
        return projectPort.projectsInNote(noteId);
    }

    @Override
    public List<Area> areas(UUID noteId) {
        return shelfPort.areasInNote(noteId);
    }

    @Override
    public List<Resource> resources(UUID noteId) {
        return shelfPort.resourcesInNote(noteId);
    }

    @Override
    public List<Archive> archives(UUID noteId) {
        return shelfPort.archivesInNote(noteId);
    }
    @Override
    public void registPara(UUID noteId, Para para) {
        if (para == null || para.paraId() == null) {
            throw new RuntimeException("id는 필수 입니다.");
        }
        if (para instanceof Project project) {
            projectPort.registNote(noteId, project);
        } else {
            shelfPort.addNote(noteId, para);
        }
    }

    @Override
    public Note getNote(UUID noteId) {
        return notePort.getNote(noteId);
    }

    @Override
    public void removeNote(UUID noteId) {
        notePort.removeNote(noteId);
    }

    @Override
    public Note modifyNote(Note modifiedNote) {
        notePort.save(modifiedNote);
        return notePort.getNote(modifiedNote.noteId());
    }

    @Override
    public Note addNote(Note newNote) {
        return notePort.newNote(newNote);
    }

    @Override
    public Set<Tag> tags(UUID noteId) {
        return tagPort.tagsInNote(noteId);
    }

    @Override
    public Set<Tag> registTag(UUID noteId, Tag tag) {
        tagPort.addTagInNote(noteId, tag);
        return tagPort.tagsInNote(noteId);
    }

    @Override
    public Set<Tag> removeTag(UUID noteId, Tag tag) {
        tagPort.removeTagInNote(noteId, tag);
        return tagPort.tagsInNote(noteId);
    }

}
