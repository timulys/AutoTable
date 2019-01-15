package com.exam.autotable.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Subject {
    // 과목 ID
    private long id;
    // 과목 학점
    private int credit;
    // 일정
    private List<Schedule> scheduleList;
}
