package com.ohhoonim.exercise_springdata.para.port;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.ohhoonim.exercise_springdata.para.Note;
import com.ohhoonim.exercise_springdata.para.Page;
import com.ohhoonim.exercise_springdata.para.Para;
import com.ohhoonim.exercise_springdata.para.Para.Project;

public interface ProjectPort {

    List<Project> findProjects(String searchString, Page page);

    List<Project> projectsInNote(UUID noteId);

    void registNote(UUID noteId, Project project);

    void addProject(Project project, UUID newParaId);

    Optional<Para> getProject(UUID paraId);

    List<Note> notes(Project para);

    void removeNote(UUID noteId, Project p);

    void removeProject(Project p);

    void modifyProject(Project p);
    
}
