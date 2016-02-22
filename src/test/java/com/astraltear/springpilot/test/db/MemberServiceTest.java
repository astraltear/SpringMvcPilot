package com.astraltear.springpilot.test.db;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.astraltear.springpilot.service.MemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberServiceTest {

	@Inject
	MemberService memberService;
	
	@Test
	public void test() {
		memberService.readMember("test11");
	}

}
