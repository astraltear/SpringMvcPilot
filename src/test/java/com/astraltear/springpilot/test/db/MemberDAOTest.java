package com.astraltear.springpilot.test.db;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.astraltear.springpilot.persist.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {
	
	@Inject
	MemberDAO memberDAO;

	@Test
	public void test() {
		System.out.println("memberDAO.getTime():::"+memberDAO.getTime());
	}

}
