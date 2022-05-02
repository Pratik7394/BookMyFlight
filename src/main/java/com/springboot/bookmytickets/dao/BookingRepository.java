package com.springboot.bookmytickets.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.bookmytickets.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
