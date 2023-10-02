package com.example.testboot.mapper;

import com.example.testboot.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    Student getStudent(String name);
}
