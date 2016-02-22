package com.astraltear.springpilot.persist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class CustomerRoutingDataSource extends AbstractRoutingDataSource {
	private static final Logger log = LoggerFactory.getLogger(CustomerRoutingDataSource.class);
	
	private Object runType; 


	@Override
	protected Object determineCurrentLookupKey() {
		log.debug("CustomerRoutingDataSource.determineCurrentLookupKey runType:"+runType);
		 return runType;
	}
	

}
