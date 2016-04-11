package com.astraltear.springpilot.persist;

import java.util.List;

import com.astraltear.springpilot.domain.MemberVO;

public interface MemberDAO {
	public String getTime();
	public void insertMember(MemberVO vo);
	public MemberVO readMember(String userid) throws Exception;
	public MemberVO readWithPW(String userid,String userpw) throws Exception;
	public List readMemberAll() throws Exception ;
}
