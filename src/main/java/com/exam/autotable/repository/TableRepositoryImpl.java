package com.exam.autotable.repository;

import com.exam.autotable.domain.Table;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TableRepositoryImpl implements TableRepository {

    @Override
    public List<Table> findTableByStudentId(long studentId) {
        return null;
    }
}
