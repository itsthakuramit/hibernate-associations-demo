package com.stackroute.samplepassengerrealtion.dao;

import java.util.List;

import com.stackroute.samplepassengerrealtion.model.Train;

public interface iTrain {

	Train add(Train train);
	List<Train> view();
	
}
