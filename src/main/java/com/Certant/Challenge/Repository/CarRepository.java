package com.Certant.Challenge.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Certant.Challenge.Entity.CarEntity;


public interface CarRepository extends JpaRepository<CarEntity, String>{

	
	
}
