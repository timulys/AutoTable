package com.exam.autotable.repository;

import com.exam.autotable.domain.Table;

import java.util.List;

public interface TableRepository {
    List<Table> findTableByStudentId(long studentId);
}
