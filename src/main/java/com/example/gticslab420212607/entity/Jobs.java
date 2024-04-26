package com.example.gticslab420212607.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Jobs {

    @Id
    @Column(name="job_id",nullable = false)
    private String jobId;

    @Column(name="job_title",nullable = true)
    private String jobTitle;

    @Column(name="min_salary",nullable = true)
    private Integer minSalary;

    @Column(name="max_salary",nullable = true)
    private Integer maxSalary;


}
