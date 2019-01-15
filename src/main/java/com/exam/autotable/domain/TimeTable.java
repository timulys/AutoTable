package com.exam.autotable.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class TimeTable {
    // 총 교시
    private final int[] totalPeriod = new int[8];
    // 과목목록
    private List<Subject> subjectList;
    // 전체 이수 학점
    public int getTotalCredit() {
        return this.subjectList.stream().mapToInt(Subject::getCredit).sum();
    }
}
