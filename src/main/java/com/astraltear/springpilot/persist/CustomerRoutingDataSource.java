package com.astraltear.springpilot.persist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

@PropertySource("classpath:database.properties")
public class CustomerRoutingDataSource extends AbstractRoutingDataSource {
	
	private static final Logger log = LoggerFactory.getLogger(CustomerRoutingDataSource.class);
	
	@Value("${database.type}")
	private Object runType; 


	@Override
	protected Object determineCurrentLookupKey() {
		log.info("CustomerRoutingDataSource.determineCurrentLookupKey call!!!!");
		 return runType;
	}

}
