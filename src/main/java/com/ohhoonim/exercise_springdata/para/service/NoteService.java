package com.ohhoonim.exercise_springdata.para.service;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ohhoonim.exercise_springdata.para.Note;
import com.ohhoonim.exercise_springdata.para.Note.Usecase;
import com.ohhoonim.exercise_springdata.para.Para;
import com.ohhoonim.exercise_springdata.para.Para.Area;
import com.ohhoonim.exercise_springdata.para.Para.Project;
import com.ohhoonim.exercise_springdata.para.Para.Resource;
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
        return null;
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
        return notePort.getNote(noteId);
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
        return notePort.newNote(newNote);
    }

    @Override
    public Set<Tag> tags(UUID noteId) {
        return tagPort.tagsInNote(noteId);
    }

    @Override
    public Set<Tag> addTag(UUID noteId, Tag tag) {
        tagPort.addTagInNote(noteId, tag);
        return tagPort.tagsInNote(noteId);
    }

    @Override
    public Set<Tag> removeTag(UUID noteId, Tag tag) {
        tagPort.removeTagInNote(noteId, tag);
        return tagPort.tagsInNote(noteId);
    }

}
