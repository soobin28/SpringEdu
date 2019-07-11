package edu.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	@Autowired // MemberDao객체를 자동으로 주입 받아옴
	@Qualifier("boardDao") // memberDao도 있기 때문에 하나를 지정해 주어야 함.
	BoardDao boardDao;

	public int addBoard(BoardDto boardDto) {
		return boardDao.insertBoard(boardDto);
	}
}
