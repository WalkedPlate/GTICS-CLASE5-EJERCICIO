package com.example.gticslab420212607.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Entity
@Getter
@Setter
public class Employees {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="employee_id",nullable = false)
    private int employeeId;

    @Column(name="first_name",nullable = true)
    private String firstName;

    @Column(name="last_name",nullable = true)
    private String lastName;

    @Column(name="email",nullable = true)
    private String email;

    @Column(name="password",nullable = true)
    private String password;

    @Column(name="phone_number",nullable = true)
    private String phoneNumber;


    @Column(name="hire_date",nullable = true)
    private String hireDate;

    @Column(name="salary",nullable = true)
    private BigDecimal salary;

    @Column(name="commission_pct",nullable = true)
    private BigDecimal commissionpct;

    @Column(name="enabled",nullable = true)
    private Integer enabled;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Jobs jobs;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employees manager;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = true)
    private Departments departments;

}
