package com.astraltear.springpilot.persist;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.astraltear.springpilot.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace="com.astraltear.springpilot.mapper.MemberMapper";

	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertMember(MemberVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	
	public MemberVO readMember(String userid) throws Exception {
		return sqlSession.selectOne(namespace+".readMember",userid);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List readMemberAll() throws Exception {
		return sqlSession.selectList(namespace+".readMemberAll");
		
	}

	@Override
	public MemberVO readWithPW(String userid, String userpw) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
