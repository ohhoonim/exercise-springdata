package com.ohhoonim.exercise_springdata.para.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ohhoonim.exercise_springdata.para.Note;
import com.ohhoonim.exercise_springdata.para.Para.Archive;
import com.ohhoonim.exercise_springdata.para.Para.Archive.Usecase;

@Service
public class ArchiveService implements Usecase{

    @Override
    public List<Note> notes(UUID archiveId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notes'");
    }

    @Override
    public List<Note> addNote(UUID areaId, Note note) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addNote'");
    }

    @Override
    public List<Note> removeNote(UUID areaId, Note note) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeNote'");
    }

    @Override
    public List<Note> moveToArea(UUID archive) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveToArea'");
    }

    @Override
    public List<Note> moveToResource(UUID archiveId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveToResource'");
    }

    @Override
    public Archive getArchive(UUID paraId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArchive'");
    }

    @Override
    public Archive saveArchive(UUID paraId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveArchive'");
    }
    
}
