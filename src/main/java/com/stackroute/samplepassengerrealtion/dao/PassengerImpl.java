package com.stackroute.samplepassengerrealtion.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stackroute.samplepassengerrealtion.model.Passenger;

@Repository
@Transactional

public class PassengerImpl  implements iPassenger{

	
	@Autowired
	SessionFactory sessfactory;
	
	
	
	public Passenger add(Passenger passobj) {
		sessfactory.getCurrentSession().save(passobj);
		return passobj;
	}

	public List<Passenger> view() {
	return	sessfactory.getCurrentSession().createQuery("from Passenger").list();
		 
	}
	

}
