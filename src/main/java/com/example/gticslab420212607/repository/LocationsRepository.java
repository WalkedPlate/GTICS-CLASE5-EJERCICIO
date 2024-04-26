package com.example.gticslab420212607.repository;

import com.example.gticslab420212607.entity.Countries;
import com.example.gticslab420212607.entity.Locations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationsRepository extends JpaRepository<Locations,Integer> {
}
