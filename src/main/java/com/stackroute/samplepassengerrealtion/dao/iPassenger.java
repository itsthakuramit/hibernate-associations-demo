package com.stackroute.samplepassengerrealtion.dao;

import java.util.List;

import com.stackroute.samplepassengerrealtion.model.Passenger;

public interface iPassenger {

	Passenger add(Passenger passobj);
	List<Passenger> view();
	
}
