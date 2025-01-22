package com.ohhoonim.exercise_springdata.para.port;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.ohhoonim.exercise_springdata.para.Note;
import com.ohhoonim.exercise_springdata.para.Page;

public interface NotePort {

    void addNote(Note newNote, UUID newNoteId);

    Optional<Note> getNote(UUID noteId);

    void modifyNote(Note modifiedNote);

    void removeNote(UUID noteId);

    List<Note> findNote(String searchString, Page page);
    
}
