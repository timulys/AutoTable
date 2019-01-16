package com.exam.autotable.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Subject {
    // 과목 ID
    private long id;
    // 과목 이름
    private String name;
    // 과목 담당 교수
    private String professor;
    // 과목 학점
    private int credit;
    // 일정
    private List<Schedule> scheduleList;
}
