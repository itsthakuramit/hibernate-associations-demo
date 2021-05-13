package com.stackroute.samplepassengerrealtion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.samplepassengerrealtion.dao.iPassenger;
import com.stackroute.samplepassengerrealtion.model.Passenger;

@Service
public class PassengerServiceImpl implements PassengerService
{

	@Autowired
	iPassenger passdao;
	
	public Passenger addPassengers(Passenger pass) 
	{
  return passdao.add(pass);
	}

	public List<Passenger> viewPassengers() 
	{
		return passdao.view();
	}

}
