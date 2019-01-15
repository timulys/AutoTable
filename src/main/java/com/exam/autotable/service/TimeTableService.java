package com.exam.autotable.service;

import com.exam.autotable.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeTableService {
    @Autowired
    private SubjectRepository subjectRepository;

    public boolean createTimeTable() {
        // TODO : 시간표 생성 Logic

        return true;
    }

}
