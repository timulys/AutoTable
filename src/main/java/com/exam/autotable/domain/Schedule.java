package com.exam.autotable.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Getter
public class Schedule {
    private List<Time> timeList;
}
