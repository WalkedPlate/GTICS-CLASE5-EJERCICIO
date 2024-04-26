package com.example.gticslab420212607.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Locations {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="location_id",nullable = false)
    private Integer locationiD;

    @Column(name="street_address",nullable = true)
    private String streetAddress;

    @Column(name="postal_code",nullable = true)
    private String postalCode;

    @Column(name="city",nullable = true)
    private String city;

    @Column(name="state_province",nullable = true)
    private String stateProvince;


    @ManyToOne
    @JoinColumn(name = "country_id")
    private Countries countries;

}
