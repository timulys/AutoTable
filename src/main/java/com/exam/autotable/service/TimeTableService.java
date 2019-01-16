package com.exam.autotable.service;

import com.exam.autotable.domain.*;
import com.exam.autotable.repository.SubjectRepository;
import com.exam.autotable.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TimeTableService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private TableRepository tableRepository;

    public Subject getSubject(long subjectId) {
        return subjectRepository.findBySubjectId(subjectId);
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    public List<Table> getTimeTable(long studentId) {
        return tableRepository.findTableByStudentId(studentId);
    }

    public List<Table> createTimeTable(List<Subject> subjectList) {
        List<Table> timeTableList = new ArrayList<>();

        subjectList.stream().filter(s -> {
            Table table = new Table();
            Period[] period = table.getPeriod();

            List<Schedule> scheduleList = s.getScheduleList();
            // TODO : 시간표 생성 Logic
            scheduleList.stream().forEach(sh -> {
                List<Time> timeList = sh.getTimeList();

            });
            return true;
        }).collect(Collectors.toList());

        return timeTableList;
    }
}
