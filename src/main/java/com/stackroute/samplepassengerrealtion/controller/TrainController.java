package com.stackroute.samplepassengerrealtion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.samplepassengerrealtion.model.Passenger;
import com.stackroute.samplepassengerrealtion.model.Train;
import com.stackroute.samplepassengerrealtion.service.PassengerService;
import com.stackroute.samplepassengerrealtion.service.TrainService;

@RestController
@RequestMapping("/api/railway/train")
public class TrainController {

	@Autowired
	TrainService trainservice;
	
	@GetMapping("/trains")
	public ResponseEntity<?> gettrainsdata()
	{
		  List<Train> trains= trainservice.viewTrains();
		return new ResponseEntity<List>(trains,HttpStatus.OK);
	}
	
	@PostMapping("/addtrain")
	public ResponseEntity<?> addtrain(@RequestBody Train train)
	{
		Train trainnew=trainservice.addTrain(train);
		return new ResponseEntity<Train>(trainnew,HttpStatus.CREATED);
	}
	
	
}
