package com.springboot.bookmytickets.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name = "num_of_passengers")
	private int numOfPassengers;
	
	@Column(name = "booking_date")
	private Date bookingDate;
	
	@Column(name = "doj")
	private Date dateOfJourney;
	
	@Column(name = "booking_last_modified")
	private Date lastModified;
	
	@OneToOne
	@JoinColumn(name = "booking_last_modified_by")
	private User bookingModifiedbyUser;
	
	@ManyToOne
	@JoinColumn(name = "flight_schedule_id" , referencedColumnName = "id")
	private FlightSchedule flightSchedule;
	
	@OneToOne
	@JoinColumn(name = "id")
	private Discount discount;

	@Column(name = "amount")
	private int bookingAmount;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getNumOfPassengers() {
		return numOfPassengers;
	}

	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getDateOfJourney() {
		return dateOfJourney;
	}

	public void setDateOfJourney(Date dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public User getBookingModifiedbyUser() {
		return bookingModifiedbyUser;
	}

	public void setBookingModifiedbyUser(User bookingModifiedbyUser) {
		this.bookingModifiedbyUser = bookingModifiedbyUser;
	}

	public FlightSchedule getFlightSchedule() {
		return flightSchedule;
	}

	public void setFlightSchedule(FlightSchedule flightSchedule) {
		this.flightSchedule = flightSchedule;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	

	public int getBookingAmount() {
		return bookingAmount;
	}

	public void setBookingAmount(int bookingAmount) {
		this.bookingAmount = bookingAmount;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", user=" + user + ", numOfPassengers=" + numOfPassengers + ", bookingDate="
				+ bookingDate + ", dateOfJourney=" + dateOfJourney + ", lastModified=" + lastModified
				+ ", bookingModifiedbyUser=" + bookingModifiedbyUser + ", flightSchedule=" + flightSchedule
				+ ", discount=" + discount + ", bookingAmount=" + bookingAmount + "]";
	}

	
}
