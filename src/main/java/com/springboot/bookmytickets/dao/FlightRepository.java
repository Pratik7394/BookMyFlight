package com.springboot.bookmytickets.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.bookmytickets.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
