package com.springboot.bookmytickets.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.bookmytickets.entity.Discount;

public interface DiscountRepository extends JpaRepository<Discount, Integer> {

}
