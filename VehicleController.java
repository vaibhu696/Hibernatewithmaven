package com.controller;

import com.service.Vehicleservice;

public class VehicleController {
	public static void main(String[] args) {
		Vehicleservice vs = new  Vehicleservice();
		vs.InsertData();
		System.out.println("Data is inserted successfully....");
		
	}

}
