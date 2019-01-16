package com.exam.autotable.controller;

import com.exam.autotable.domain.Subject;
import com.exam.autotable.domain.Table;
import com.exam.autotable.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TimeTableController {

    @Autowired
    private TimeTableService timeTableService;

    @GetMapping(value = "/")
    public String main() {
        return "main";
    }

    @GetMapping(value = "/subjectList")
    public String getSubjectList(Model model) {
        List<Subject> subjectList = timeTableService.getAllSubjects();
        model.addAttribute("subjectList", subjectList);
        return "main";
    }

    @GetMapping(value = "/timeTableList")
    public String getTimeTable(Model model, long studentId) {
        List<Table> tableList = timeTableService.getTimeTable(studentId);
        model.addAttribute("tableList", tableList);
        return "main";
    }

    @PostMapping(value = "/createTable")
    public String createTimeTable(Model model, List<Subject> subjectList) {
        List<Table> timeTable = timeTableService.createTimeTable(subjectList);
        model.addAttribute("timeTable", timeTable);
        return "main";
    }
}
