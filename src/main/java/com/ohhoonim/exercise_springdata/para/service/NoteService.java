package com.ohhoonim.exercise_springdata.para.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ohhoonim.exercise_springdata.para.Note;
import com.ohhoonim.exercise_springdata.para.Note.Usecase;
import com.ohhoonim.exercise_springdata.para.Para;
import com.ohhoonim.exercise_springdata.para.Para.Area;
import com.ohhoonim.exercise_springdata.para.Para.Project;
import com.ohhoonim.exercise_springdata.para.Para.Resource;

@Service
public class NoteService implements Usecase {

    @Override
    public List<Project> projects(UUID noteId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'projects'");
    }

    @Override
    public List<Area> areas(UUID noteId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'areas'");
    }

    @Override
    public List<Resource> resources(UUID noteId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'resources'");
    }

    @Override
    public List<Para> addPara(UUID noteId, UUID paraId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addPara'");
    }

    @Override
    public Note getNote(UUID noteId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNote'");
    }

    @Override
    public Note removeNote(UUID noteId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeNote'");
    }

    @Override
    public Note modifyNote(Note modifiedNote) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifyNote'");
    }

    @Override
    public Note newNote(Note newNote) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'newNote'");
    }
    
}
