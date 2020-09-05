package com.oms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Asset {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String AssetId;
	private String Name;
	private String Size;
	@ManyToOne
	@JoinColumn(name="Id", insertable = true, updatable = true)
	private Tenant tenant; 
	
	public Asset(String id, String name, String size) {
		super();
		AssetId = id;
		Name = name;
		Size = size;
	}
	
	public String getId() {
		return AssetId;
	}
	public void setId(String id) {
		AssetId = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}

	public Asset() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
	