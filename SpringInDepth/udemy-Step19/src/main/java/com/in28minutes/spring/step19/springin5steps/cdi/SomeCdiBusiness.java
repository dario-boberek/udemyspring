package com.in28minutes.spring.step19.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named("SomeCdiBusinessStep19")
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCDIDAO() {
		return someCdiDao;
	}

	public void setSomeCDIDAO(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
}
