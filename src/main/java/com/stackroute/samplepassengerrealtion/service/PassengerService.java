package com.stackroute.samplepassengerrealtion.service;

import java.util.List;

import com.stackroute.samplepassengerrealtion.model.Passenger;

public interface PassengerService {

	Passenger addPassengers(Passenger pass);
	List<Passenger> viewPassengers();
	
}
