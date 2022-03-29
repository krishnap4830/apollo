package com.example.Intercity.bean;

import javax.persistence.*;

@Entity
@Table(name="vehicle")
public class VehicleBean 
{
	@Id
	private int vehicleid;
	private String name;
	private String type;
	private String registrationnumber;
	private int seatingcapacity;
	private int fareperkm;
	public int getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRegistrationnumber() {
		return registrationnumber;
	}
	public void setRegistrationnumber(String registrationnumber) {
		this.registrationnumber = registrationnumber;
	}
	public int getSeatingcapacity() {
		return seatingcapacity;
	}
	public void setSeatingcapacity(int seatcap) {
		this.seatingcapacity = seatcap;
	}
	public int getFareperkm() {
		return fareperkm;
	}
	public void setFareperkm(int fareperkm) {
		this.fareperkm = fareperkm;
	}

}
