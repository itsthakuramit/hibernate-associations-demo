package com.stackroute.samplepassengerrealtion.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Train {

	@Id
	int trainino;
	String trainname;
	
	@JsonIgnore
	@OneToMany
	List<Passenger> passengers;

	public int getTrainino() {
		return trainino;
	}

	public void setTrainino(int trainino) {
		this.trainino = trainino;
	}

	public String getTrainname() {
		return trainname;
	}

	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	
}
