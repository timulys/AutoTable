package com.exam.autotable.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Table {
    // 총 교시
    private Period[] period;
    // 과목목록
    private List<Subject> subjectList;
    // 전체 이수 학점
    public int getTotalCredit() {
        return this.subjectList.stream().mapToInt(Subject::getCredit).sum();
    }

    public Table() {
        this.period  = new Period[5];
        period[0] = new Period("월");
        period[1] = new Period("화");
        period[2] = new Period("수");
        period[3] = new Period("목");
        period[4] = new Period("금");
    }
}
