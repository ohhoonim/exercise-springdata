package com.ohhoonim.exercise_springdata.para;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public sealed interface Para {
    public UUID paraId();

    public String title();

    public String content();

    public record Project(
            UUID paraId,
            String title,
            String content,
            LocalDate startDate,
            LocalDate endDate,
            Status status) implements Para {

        public interface Usecase {
            public List<Note> notes(UUID projectId);

            public List<Note> addNote(UUID projectId, Note note);

            public List<Note> removeNote(UUID projectId, Note note);

            public Project getProject(UUID paraId);

            public Project saveProject(Project paraId);
        }
    }

    public record Area(
            UUID paraId,
            String title,
            String content) implements Para {
        public interface Usecase {
            public List<Note> notes(UUID areaId);

            public List<Note> addNote(UUID areaId, Note note);

            public List<Note> removeNote(UUID areaId, Note note);

            public List<Note> moveToResource(UUID targetResourceId);

            public List<Note> moveToArchive(UUID targetArchiveId);

            public Area getArea(UUID paraId);

            public Area saveArea(Area area);
        }
    }

    public record Resource(
            UUID paraId,
            String title,
            String content) implements Para {
        public interface Usecase {
            public List<Note> notes(UUID resourceId);

            public List<Note> addNote(UUID areaId, Note note);

            public List<Note> removeNote(UUID areaId, Note note);

            public List<Note> moveToArea(UUID resourceId);

            public List<Note> moveToArchive(UUID resourceId);

            public Resource getResource(UUID paraId);

            public Resource saveResource(UUID paraId);
        }
    }

    public record Archive(
            UUID paraId,
            String title,
            String content) implements Para {
        public interface Usecase {
            public List<Note> notes(UUID archiveId);

            public List<Note> addNote(UUID areaId, Note note);

            public List<Note> removeNote(UUID areaId, Note note);

            public List<Note> moveToArea(UUID archive);

            public List<Note> moveToResource(UUID archiveId);

            public Archive getArchive(UUID paraId);

            public Archive saveArchive(UUID paraId);
        }
    }
}
