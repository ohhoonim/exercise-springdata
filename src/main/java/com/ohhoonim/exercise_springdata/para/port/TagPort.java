package com.ohhoonim.exercise_springdata.para.port;

import java.util.Set;
import java.util.UUID;

import com.ohhoonim.exercise_springdata.para.Page;
import com.ohhoonim.exercise_springdata.para.Tag;

public interface TagPort {

    Set<Tag> findTags(String tag, Page page);

    void addTagInNote(UUID noteId, Tag tag);

    Set<Tag> tagsInNote(UUID noteId);

    void removeTagInNote(UUID noteId, Tag tag);
    
}
