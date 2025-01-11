# Hibernatewithmaven

Description (Optional):

 Created the VehicleController for handling requests.
Developed VehicleService for business logic.
Implemented VehicleDAO for database interactions.
Configured Hibernate with Maven dependencies

# Vehicle Entity Code
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

# Vehicle Dao Code

package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Vehicle;

public class VehicleDao {
	
	public void InsertData() {
		
			
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml") ;
				cfg.addAnnotatedClass(Vehicle.class);
				SessionFactory sf = cfg.buildSessionFactory();
				Session ss=sf.openSession();
				Transaction tr=ss.beginTransaction();
				
				
				
				 Vehicle v = new Vehicle();
				 v.setId(1);
				 v.setModel("Honda City");
				 v.setType("sedan");
				 
				 ss.persist(v);
				 tr.commit();
				 ss.close();
		        
			}

		

		
	}


# VehicleService Code
package com.service;

import com.dao.VehicleDao;

public class Vehicleservice {
	
	public void InsertData() {
		VehicleDao VD = new VehicleDao();
		VD.InsertData();
	}

}

# Vehicle Controller Code

package com.controller;

import com.service.Vehicleservice;

public class VehicleController {
	public static void main(String[] args) {
		Vehicleservice vs = new  Vehicleservice();
		vs.InsertData();
		System.out.println("Data is inserted successfully....");
		
	}

}


