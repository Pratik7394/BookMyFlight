package com.springboot.bookmytickets.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.bookmytickets.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
