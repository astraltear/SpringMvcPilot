package com.astraltear.springpilot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.astraltear.springpilot.domain.MemberVO;
import com.astraltear.springpilot.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	MemberService memberService;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public MemberVO readMember(@RequestParam("userid") String userid) {
		
		log.debug("MemberController.readMember>>>>>>"+userid);
		
		return memberService.readMember(userid);
		
	}
	@RequestMapping(value="/getAllMember", method=RequestMethod.GET, produces= {"application/json"})
	
	public ResponseEntity<List<MemberVO>> getMemberJackson(){
		List list = new ArrayList<MemberVO>();
		
		list = memberService.readMemberAll();
		
		return new ResponseEntity<List<MemberVO>>(list,HttpStatus.OK);
	}
}
