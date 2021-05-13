package com.stackroute.samplepassengerrealtion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.samplepassengerrealtion.model.Passenger;
import com.stackroute.samplepassengerrealtion.service.PassengerService;

@RestController
@RequestMapping("/api/railway/pass")

public class PassengerController {
	
	@Autowired
	PassengerService passserve;
	
	@RequestMapping("/viewpassengers")
	public ResponseEntity<?> getpassengers()
	{
	List<Passenger> passengers=	passserve.viewPassengers();
	return new ResponseEntity<List>(passengers,HttpStatus.OK);
	}
	
	@PostMapping("/addpassenger")
	public ResponseEntity<?> addpassenger(@RequestBody Passenger pass)
	{
		
		Passenger passnew=passserve.addPassengers(pass);
		return new ResponseEntity<Passenger>(passnew,HttpStatus.CREATED);
	}
	

}
