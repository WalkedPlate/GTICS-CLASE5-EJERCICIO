package com.example.gticslab420212607.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Regions {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="region_id",nullable = false)
    private BigDecimal regionId;

    @Column(name="region_name",nullable = true)
    private String regionName;

}
