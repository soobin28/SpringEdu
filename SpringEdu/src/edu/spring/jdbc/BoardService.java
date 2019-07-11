package edu.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	@Autowired // MemberDao��ü�� �ڵ����� ���� �޾ƿ�
	@Qualifier("boardDao") // memberDao�� �ֱ� ������ �ϳ��� ������ �־�� ��.
	BoardDao boardDao;

	public int addBoard(BoardDto boardDto) {
		return boardDao.insertBoard(boardDto);
	}
}
