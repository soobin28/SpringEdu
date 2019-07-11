package edu.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("edu/spring/jdbc/config.xml");
		MemberService ms = (MemberService)con.getBean("memberService");
//		MemberDto memberDto = new MemberDto();
//		memberDto.setId("soobin3");
//		memberDto.setPw("soobin3");
//		memberDto.setName("soobin3");
//		ms.addMember(memberDto);
		
		// 게시물 등록
		BoardService bs = (BoardService)con.getBean("boardService");
		BoardDto boardDto = new BoardDto();
		boardDto.setTitle("title1");
		boardDto.setContent("content1");
		bs.addBoard(boardDto);
		
		
		
	}
}
