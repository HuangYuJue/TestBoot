package com.example.testboot.controller;

import com.example.testboot.entity.Student;
import com.example.testboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller+@ResponseBody,就不能返回jsp,html页面
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudent")
    public Student getStudent(@RequestParam(value = "name") String name) {
        return studentService.getStudent(name);
    }
}
