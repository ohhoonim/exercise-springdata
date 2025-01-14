package com.ohhoonim.exercise_springdata.para.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ohhoonim.exercise_springdata.para.Note;
import com.ohhoonim.exercise_springdata.para.Para.Resource.Usecase;

@Service
public class ResourceService implements Usecase{

    @Override
    public List<Note> notes(UUID resourceId) {
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
    public List<Note> moveToArea(UUID resourceId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveToArea'");
    }

    @Override
    public List<Note> moveToArchive(UUID resourceId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveToArchive'");
    }

    @Override
    public com.ohhoonim.exercise_springdata.para.Para.Resource getResource(UUID paraId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResource'");
    }

    @Override
    public com.ohhoonim.exercise_springdata.para.Para.Resource saveResource(UUID paraId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveResource'");
    }
    
}
