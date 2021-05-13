package com.stackroute.samplepassengerrealtion.service;

import java.util.List;

import com.stackroute.samplepassengerrealtion.model.Train;

public interface TrainService {
Train addTrain(Train train);
List<Train> viewTrains();
}
