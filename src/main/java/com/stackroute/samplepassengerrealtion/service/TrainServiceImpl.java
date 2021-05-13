package com.stackroute.samplepassengerrealtion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.samplepassengerrealtion.dao.iTrain;
import com.stackroute.samplepassengerrealtion.model.Train;

@Service
public class TrainServiceImpl implements TrainService {

	@Autowired
	iTrain traindao;
	
	public Train addTrain(Train train) {
		
		return traindao.add(train);
	}

	public List<Train> viewTrains() {
	
		return traindao.view();
	}

}
