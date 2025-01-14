package com.ohhoonim.exercise_springdata.para.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ohhoonim.exercise_springdata.para.Page;
import com.ohhoonim.exercise_springdata.para.Tag;
import com.ohhoonim.exercise_springdata.para.Tag.Usecase;

@Service
public class TagService implements Usecase{

    @Override
    public List<Tag> findTagsLimit20PerPage(String tag, Page page) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findTagsLimit20PerPage'");
    }
    
}
