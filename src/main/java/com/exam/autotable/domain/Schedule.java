package com.exam.autotable.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Schedule {
    // 수업 요일
    private String day;
    // 수업 시간
    private int period;
}
