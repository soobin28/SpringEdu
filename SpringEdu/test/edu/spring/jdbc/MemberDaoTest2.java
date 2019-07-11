package edu.spring.jdbc;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.spring.jdbc.MemberDto;
import edu.spring.jdbc.MemberService;

class MemberDaoTest2 {

	@Test
	public void insert() {
		ApplicationContext con = new ClassPathXmlApplicationContext("edu/spring/jdbc/config.xml");
		MemberService ms = (MemberService) con.getBean("memberService");
		MemberDto memberDto = new MemberDto();
		memberDto.setId("soobin2");
		memberDto.setPw("soobin2");
		memberDto.setName("soobin2");
		ms.addMember(memberDto);
	}

}
