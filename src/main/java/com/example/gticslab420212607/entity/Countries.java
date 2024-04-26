package com.example.gticslab420212607.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Countries {

    @Id
    @Column(name="country_id",nullable = false)
    private String jobId;

    @Column(name="country_name",nullable = true)
    private String jobTitle;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Regions regions;




}
