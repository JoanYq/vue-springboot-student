package com.stu.demo.controller;

import com.stu.demo.entity.Students;
import com.stu.demo.reposity.StudentsReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/stu")
public class StudentHandler {
    @Autowired
    private StudentsReposity studentsReposity;

//    @GetMapping("/findAll")
//    public List<Students> findAll(){
//        return studentsReposity.findAll();
//    }

    @GetMapping("/findAll/{page}/{size}")
    public Page<Students> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Pageable pageable = PageRequest.of(page-1,size);
        return studentsReposity.findAll(pageable);
    }

}
