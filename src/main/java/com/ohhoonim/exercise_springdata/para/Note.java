package com.ohhoonim.exercise_springdata.para;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.ohhoonim.exercise_springdata.para.Para.Project;
import com.ohhoonim.exercise_springdata.para.Para.Shelf.Archive;
import com.ohhoonim.exercise_springdata.para.Para.Shelf.Area;
import com.ohhoonim.exercise_springdata.para.Para.Shelf.Resource;

public record Note(
        UUID noteId,
        String title,
        String content) {

    public interface Usecase {
        public List<Project> projects(UUID noteId);

        public List<Area> areas(UUID noteId);

        public List<Resource> resources(UUID noteId);

        public List<Archive> archives(UUID noteId);

        public void registPara(UUID noteId, Para para);

        public Note getNote(UUID noteId);

        public void removeNote(UUID noteId);

        public Note modifyNote(Note modifiedNote);

        public Note addNote(Note newNote);

        public Set<Tag> tags(UUID noteId);

        public Set<Tag> registTag(UUID noteId, Tag tag);

        public Set<Tag> removeTag(UUID noteId, Tag tag);
    }
}