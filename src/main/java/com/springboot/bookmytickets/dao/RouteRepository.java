package com.springboot.bookmytickets.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.bookmytickets.entity.Route;

public interface RouteRepository extends JpaRepository<Route, Integer> {

}
