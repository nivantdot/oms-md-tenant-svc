package com.oms.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Tenant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String Id;
	private String Name;
	private String Email;
	private String offering;
	private String number;
	@OneToMany(targetEntity=Asset.class, cascade=CascadeType.ALL, mappedBy="tenant", fetch = FetchType.EAGER)
	private List<Asset> assets;

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

	public List<Asset> getAssets() {
		return assets;
	}

	public void setAssets(List<Asset> assets) {
		this.assets = assets;
	}

	public Tenant(String id, String name, String email, String offering, String number, List<Asset> assets) {
		super();
		Id = id;
		Name = name;
		Email = email;
		this.offering = offering;
		this.number = number;
		this.assets = assets;
	}

	public Tenant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
}
	