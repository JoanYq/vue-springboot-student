package com.stu.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Students {
    @Id
    private Integer id;
    private String name;
    private String sex;
}
