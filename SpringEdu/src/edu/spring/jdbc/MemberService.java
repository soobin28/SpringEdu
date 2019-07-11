package edu.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class MemberService {
	@Autowired // MemberDao객체를 자동으로 주입 받아옴
	MemberDao memberDao;

	public int addMember(MemberDto memberDto) {
		return memberDao.insertMember(memberDto);
	}
}