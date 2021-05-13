package com.stackroute.samplepassengerrealtion.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stackroute.samplepassengerrealtion.model.Train;

@Repository
@Transactional
public class TrainImpl  implements iTrain{

	@Autowired
	SessionFactory sessfactory;
	
	public Train add(Train train) {
sessfactory.getCurrentSession().save(train);
return train;
	}

	public List<Train> view() {
		// TODO Auto-generated method stub
		return sessfactory.getCurrentSession().createQuery("from Train").list();
	}

}
