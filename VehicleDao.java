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


