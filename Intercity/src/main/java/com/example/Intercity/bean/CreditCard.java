package com.example.Intercity.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="creditcard")
public class CreditCard {
	
	@Id
	private String creditcardnumber;
	private String validfrom;
	private String validto;
	private int creditbalance;
	private String userid;
	public String getCreditcardnumber() {
		return creditcardnumber;
	}
	public void setCreditcardnumber(String creditcardnumber) {
		this.creditcardnumber = creditcardnumber;
	}
	public String getValidfrom() {
		return validfrom;
	}
	public void setValidfrom(String validfrom) {
		this.validfrom = validfrom;
	}
	public String getValidto() {
		return validto;
	}
	public void setValidto(String validto) {
		this.validto = validto;
	}
	public int getCreditbalance() {
		return creditbalance;
	}
	public void setCreditbalance(int creditbalance) {
		this.creditbalance = creditbalance;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	

}
