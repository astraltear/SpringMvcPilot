package com.astraltear.springpilot.test.db;

import static org.junit.Assert.*;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DataSourceTest {
	
	@Inject
	DataSource dataSource;

	@Test
	public void test() {
		try (Connection connection = dataSource.getConnection()) {
			System.out.println(connection.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
