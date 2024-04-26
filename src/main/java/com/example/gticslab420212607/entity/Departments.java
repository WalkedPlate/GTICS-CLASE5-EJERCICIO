package com.example.gticslab420212607.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Departments {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="department_id",nullable = false)
    private int departmentId;

    @Column(name="department_name",nullable = true)
    private String departmentName;


    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employees manager;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Locations locations;
}
