package com.codegym.cms.sevice;

import com.codegym.cms.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(Long id);
    void save(Student student);
    void remove(Long id);
}
