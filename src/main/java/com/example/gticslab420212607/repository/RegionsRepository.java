package com.example.gticslab420212607.repository;

import com.example.gticslab420212607.entity.Countries;
import com.example.gticslab420212607.entity.Regions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface RegionsRepository extends JpaRepository<Regions, BigDecimal> {
}
