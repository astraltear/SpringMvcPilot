package com.astraltear.springpilot.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.astraltear.springpilot.domain.MemberVO;
import com.astraltear.springpilot.persist.MemberDAO;

@Service
public class MemberService {
	
	@Inject
	MemberDAO memberDAO;
	
	
	public MemberVO readMember(String userid) {
		try {
			return memberDAO.readMember(userid);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public List readMemberAll() {
		try {
			return memberDAO.readMemberAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
