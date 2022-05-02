package com.springboot.bookmytickets.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.bookmytickets.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}
