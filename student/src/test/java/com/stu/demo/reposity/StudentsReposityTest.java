package com.stu.demo.reposity;

import com.stu.demo.entity.Students;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentsReposityTest {

    @Autowired
    private StudentsReposity studentsReposity;

    @Test
    void findAll(){
    System.out.println(studentsReposity.findAll());
    }
}