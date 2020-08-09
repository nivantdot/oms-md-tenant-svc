package com.oms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tenant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String Id;
	private String Name;
	private String Email;
	private String offering;
	private String number;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getOffering() {
		return offering;
	}
	public void setOffering(String offering) {
		this.offering = offering;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Tenant(String id, String name, String email, String offering, String number) {
		super();
		Id = id;
		Name = name;
		Email = email;
		this.offering = offering;
		this.number = number;
	}
	public Tenant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
	