package com.ohhoonim.exercise_springdata.para.port;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import com.ohhoonim.exercise_springdata.para.Note;
import com.ohhoonim.exercise_springdata.para.Page;
import com.ohhoonim.exercise_springdata.para.Para;
import com.ohhoonim.exercise_springdata.para.Para.Shelf;

public interface ShelfPort {

    List<Shelf> findShelves(String searchString, Page page);

    void addShelf(Shelf s, UUID newParaId);

    Optional<Para> getShelf(UUID newParaId);

    void registNote(UUID noteId, Shelf s);

    List<Note> notes(Shelf para);

    void removeNote(UUID noteId, Shelf s);

    void removeShelf(Shelf s);

    void modifyShelf(Shelf s);

    void moveToPara(Para origin, Class<? extends Shelf> targetPara);

    Set<Para> findShelfInNote(UUID noteId);

}
