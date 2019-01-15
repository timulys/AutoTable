package com.exam.autotable.repository;

import com.exam.autotable.domain.Subject;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubjectRepositoryImpl implements SubjectRepository {
    @Override
    public Subject findBySubjectId(long subjectId) {
        return null;
    }

    @Override
    public List<Subject> findAll() {
        return null;
    }
}
