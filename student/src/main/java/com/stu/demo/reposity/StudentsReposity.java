package com.stu.demo.reposity;

import com.stu.demo.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface StudentsReposity extends JpaRepository<Students,Integer> {
}
