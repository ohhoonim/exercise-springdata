package com.ohhoonim.exercise_springdata.para.infra;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.ohhoonim.exercise_springdata.para.Note;
import com.ohhoonim.exercise_springdata.para.Page;
import com.ohhoonim.exercise_springdata.para.Para;
import com.ohhoonim.exercise_springdata.para.Para.Shelf;
import com.ohhoonim.exercise_springdata.para.port.ShelfPort;

@Repository
public class ShelfRepository implements ShelfPort {
   
    private final ShelfPort shelfPort;

    public ShelfRepository(ShelfPort shelfPort) {
        this.shelfPort = shelfPort;
    }

    @Override
    public void addNote(UUID noteId, Para para) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addNote'");
    }

    @Override
    public List<Shelf> findShelves(String searchString, Page page) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findShelves'");
    }

    @Override
    public void addShelf(Shelf s, UUID newParaId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addShelf'");
    }

    @Override
    public Optional<Para> getShelf(UUID newParaId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getShelf'");
    }

    @Override
    public void registNote(UUID noteId, Shelf s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registNote'");
    }

    @Override
    public List<Note> notes(Shelf para) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notes'");
    }

    @Override
    public void removeNote(UUID noteId, Shelf s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeNote'");
    }

    @Override
    public void removeShelf(Shelf s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeShelf'");
    }

    @Override
    public void modifyShelf(Shelf s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifyShelf'");
    }

    @Override
    public void moveToPara(Para origin, Class<? extends Shelf> targetPara) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveToPara'");
    }

    @Override
    public Set<Para> findShelfInNote(UUID noteId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findShelfInNote'");
    }
}
