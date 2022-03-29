package com.example.Intercity.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="credentials")
public class CredentialsBean 
{
	@Id
	private String userid;
	private String password;
	private String usertype;
	private int loginstatus;
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public int getLoginstatus() {
		return loginstatus;
	}
	public void setLoginstatus(int loginstatus) {
		this.loginstatus = loginstatus;
	}
	

}
