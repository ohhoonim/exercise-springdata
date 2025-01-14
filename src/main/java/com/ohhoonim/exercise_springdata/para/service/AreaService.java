package com.ohhoonim.exercise_springdata.para.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ohhoonim.exercise_springdata.para.Note;
import com.ohhoonim.exercise_springdata.para.Para.Area;
import com.ohhoonim.exercise_springdata.para.Para.Area.Usecase;

@Service
public class AreaService implements Usecase{

    @Override
    public List<Note> notes(UUID areaId) {
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
    public List<Note> moveToResource(UUID targetResourceId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveToResource'");
    }

    @Override
    public List<Note> moveToArchive(UUID targetArchiveId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveToArchive'");
    }

    @Override
    public Area getArea(UUID paraId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArea'");
    }

    @Override
    public Area saveArea(Area area) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveArea'");
    }
    
}
