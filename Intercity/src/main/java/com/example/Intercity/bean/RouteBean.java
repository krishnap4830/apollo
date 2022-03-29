package com.example.Intercity.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="route")
public class RouteBean {
	
	@Id
	private int routeid;
	private String source;
	private String destination;
	private String distance;
	private String travelduration;
	public int getRouteid() {
		return routeid;
	}
	public void setRouteid(int routeid) {
		this.routeid = routeid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getTravelduration() {
		return travelduration;
	}
	public void setTravelduration(String travelduration) {
		this.travelduration = travelduration;
	}
	
	
}
