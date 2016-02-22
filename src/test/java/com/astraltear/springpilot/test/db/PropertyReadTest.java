package com.astraltear.springpilot.test.db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
@PropertySource("classpath:database.properties")
public class PropertyReadTest {

	@Value("${database.type}")
	private Object runType; 
	
	@Value("${database.run.driverClassName}")
	private String className;
	
	@Autowired
	Environment env;

	@Test
	public void test() {
		System.out.println(runType);
		System.out.println(className);
		System.out.println(env.getProperty("database.run.driverClassName"));
	}

}
