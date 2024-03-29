package com.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curse.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
	
}
