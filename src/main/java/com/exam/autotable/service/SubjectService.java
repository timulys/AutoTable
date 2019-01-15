package com.exam.autotable.service;

import com.exam.autotable.domain.Subject;
import com.exam.autotable.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public Subject getSubject(long subjectId) {
        return subjectRepository.findBySubjectId(subjectId);
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
}
