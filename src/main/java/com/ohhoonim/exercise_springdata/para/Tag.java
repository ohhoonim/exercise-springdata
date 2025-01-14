package com.ohhoonim.exercise_springdata.para;

import java.util.List;

public record Tag(
        Long tagId,
        String tag) {
    public interface Usecase {
        public List<Tag> findTagsLimit20PerPage(String tag, Page page);
    }
}