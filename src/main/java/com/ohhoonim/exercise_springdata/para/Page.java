package com.ohhoonim.exercise_springdata.para;

public record Page(
        Integer totalCount,
        Integer limit,
        Integer currentPage) {

}