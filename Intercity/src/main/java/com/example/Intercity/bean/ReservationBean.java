package com.example.Intercity.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reservation")
public class ReservationBean {
	
	@Id
	private int reservationid;
	private String userid;
	private String vehicleid;
	private String routeid;
	private String bookingdate;
	private String journeydate;
	private String driverid;
	private String bookingstatus;
	private int totalfare;
	private String boardingpoint;
	private String droppoint;
	
	public int getReservationid() {
		return reservationid;
	}
	public void setReservationid(int reservationid) {
		this.reservationid = reservationid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(String vehicleid) {
		this.vehicleid = vehicleid;
	}
	public String getRouteid() {
		return routeid;
	}
	public void setRouteid(String routeid) {
		this.routeid = routeid;
	}
	public String getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}
	public String getJourneydate() {
		return journeydate;
	}
	public void setJourneydate(String journeydate) {
		this.journeydate = journeydate;
	}
	public String getDriverid() {
		return driverid;
	}
	public void setDriverid(String driverid) {
		this.driverid = driverid;
	}
	public String getBookingstatus() {
		return bookingstatus;
	}
	public void setBookingstatus(String bookingstatus) {
		this.bookingstatus = bookingstatus;
	}
	public int getTotalfare() {
		return totalfare;
	}
	public void setTotalfare(int totalfare) {
		this.totalfare = totalfare;
	}
	public String getBoardingpoint() {
		return boardingpoint;
	}
	public void setBoardingpoint(String boardingpoint) {
		this.boardingpoint = boardingpoint;
	}
	public String getDroppoint() {
		return droppoint;
	}
	public void setDroppoint(String droppoint) {
		this.droppoint = droppoint;
	}
	
	
	
	

}
