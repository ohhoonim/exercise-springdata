package com.ohhoonim.exercise_springdata.para;

import java.util.List;
import java.util.UUID;

import com.ohhoonim.exercise_springdata.para.Para.Area;
import com.ohhoonim.exercise_springdata.para.Para.Project;
import com.ohhoonim.exercise_springdata.para.Para.Resource;

public record Note(
        UUID noteId,
        String title,
        Tag tag,
        String content) {

    public interface Usecase {
        public List<Project> projects(UUID noteId);

        public List<Area> areas(UUID noteId);

        public List<Resource> resources(UUID noteId);

        public List<Para> addPara(UUID noteId, UUID paraId);

        public Note getNote(UUID noteId);

        public Note removeNote(UUID noteId);

        public Note modifyNote(Note modifiedNote);

        public Note newNote(Note newNote);
    }
}