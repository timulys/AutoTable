package com.exam.autotable.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Period {
    // 수업 요일
    private String day;
    // 하루 수업 목록
    private Subject[] subjectList;

    public Period(String day) {
        this.day = day;
        this.subjectList = new Subject[8];
    }

}
