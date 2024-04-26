package com.example.gticslab420212607.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class JobHistory {

    @Id
    @Column(name="job_history_id",nullable = false)
    private Integer departmentId;


    @Column(name="start_date",nullable = false)
    private String startDate;



    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departments departments;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Jobs jobs;

    @ManyToOne
    @JoinColumn(name = "employees_id")
    private Employees employee;
}
