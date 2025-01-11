package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class Vehicle {
	
	 @Id
	private int id;
	private String Type;
	private String Model;
	
	// Getter and Setter 
	 public int getId() {
	        return id;
	 }

	 public void setId(int id) {
	        this.id = id;
	 }
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		this.Type = type;
	}
	public String getModel() {
		return Model;
	}
	
	
	public void setModel(String model) {
		this.Model = model;
	}
	
	
	@Override
	public String toString() {
		return "Vehicle [id=" +id+ ",Type=" + Type + ", Model=" + Model + "]";
	}
	
	
	public Vehicle() {
		
	}
	
	
	public Vehicle(String type, String model) {
		
		this.id = id;
        this.Type = type;
        this.Model = model;
	}
	
		
	
	

}