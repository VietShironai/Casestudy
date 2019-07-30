package com.codegym.cms.sevice.impl;

import com.codegym.cms.model.Student;
import com.codegym.cms.repository.StudentRepository;
import com.codegym.cms.sevice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Autowired
    public StudentRepository studentRepository;


    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findOne(id);
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);

    }

    @Override
    public void remove(Long id) {
        studentRepository.delete(id);

    }
}
