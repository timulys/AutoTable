package com.exam.autotable.repository;

import com.exam.autotable.domain.Subject;

import java.util.List;

public interface SubjectRepository {
    Subject findBySubjectId(long subjectId);
    List<Subject> findAll();
}
