package com.exam.autotable.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Getter
public class Schedule {
    // 과목 일정 목록
    private List<Time> timeList;
}
