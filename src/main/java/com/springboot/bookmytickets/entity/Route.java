package com.springboot.bookmytickets.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Route {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "source_city")
	private String sourceCity;
	
	@Column(name = "destination_city")
	private String destinationCity;
	
	@Column(name = "route_code")
	private String routeCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public String getRouteCode() {
		return routeCode;
	}

	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

	@Override
	public String toString() {
		return "Route [id=" + id + ", sourceCity=" + sourceCity + ", destinationCity=" + destinationCity
				+ ", routeCode=" + routeCode + "]";
	}
	
	
}
