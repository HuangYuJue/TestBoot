package com.example.testboot.service.impl;

import com.example.testboot.entity.Student;
import com.example.testboot.mapper.StudentMapper;
import com.example.testboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student getStudent(String name) {
        Student student = studentMapper.getStudent(name);
        return student;
    }
}
