package com.springboot.bookmytickets.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class FlightSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "flight_id", referencedColumnName = "id")
	private Flight flightId;
	
	@Column(name = "flight_date")
	private Date flightDate;
	
	@Column(name = "arrival_time")
	private Time arrivalTime;
	
	@Column(name = "departure_time")
	private Time departureTime;
	
	@ManyToOne
	@JoinColumn(name = "net_fare", referencedColumnName = "id")
	private AirFare netFare;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Flight getFlight() {
		return flightId;
	}

	public void setFlight(Flight flight) {
		this.flightId = flight;
	}

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	public Time getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public AirFare getAirFare() {
		return netFare;
	}

	public void setAirFare(AirFare airFare) {
		this.netFare = airFare;
	}

	@Override
	public String toString() {
		return "FlightSchedule [id=" + id + ", flight=" + flightId + ", flightDate=" + flightDate + ", arrivalTime="
				+ arrivalTime + ", departureTime=" + departureTime + ", airFare=" + netFare + "]";
	}
	
	
}
