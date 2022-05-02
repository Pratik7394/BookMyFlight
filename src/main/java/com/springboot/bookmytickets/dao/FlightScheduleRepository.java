package com.springboot.bookmytickets.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.bookmytickets.entity.FlightSchedule;

public interface FlightScheduleRepository extends JpaRepository<FlightSchedule, Integer> {

}
