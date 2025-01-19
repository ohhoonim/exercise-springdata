package com.ohhoonim.exercise_springdata.para.port;

import java.util.UUID;

import com.ohhoonim.exercise_springdata.para.Note;

public interface NotePort {

    Note newNote(Note newNote);

    Note getNote(UUID noteId);

    void save(Note modifiedNote);

    void removeNote(UUID noteId);
    
}
