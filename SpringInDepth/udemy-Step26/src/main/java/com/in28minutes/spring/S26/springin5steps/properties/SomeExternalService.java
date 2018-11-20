package com.in28minutes.spring.S26.springin5steps.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

	private static Logger LOGGER = LoggerFactory.getLogger(SomeExternalService.class);

	//i21c: uzycie property
	@Value("${external.service.url}")
	private String url;

	@Value("${a.b.c.d.e.f.g.h}")
	private String shit;
	
	public String returnServiceURL(){
		//i21c: dodałem zmienną w uszach i okazało się ze uszy " tez zostały zaliczone jako wartość zmiennej
		LOGGER.info("i21> {}", shit);
		return url;
	}

}
