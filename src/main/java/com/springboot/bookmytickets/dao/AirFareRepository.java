package com.springboot.bookmytickets.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.bookmytickets.entity.AirFare;

public interface AirFareRepository extends JpaRepository<AirFare, Integer> {

}
