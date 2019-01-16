package com.exam.autotable.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Time {
    // 수업 요일
    private String day;
    // 수업 시간
    private int[] period;
}
