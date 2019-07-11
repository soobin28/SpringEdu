package edu.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public int insertBoard(BoardDto boardDto) {
		String sql2 = "INSERT INTO JDBC_BOARD  (B_TITLE, B_CONTENT, B_HIT, CRE_DATE) VALUES (?, ?, 1, SYSDATE())";
		// �տ� �������� ���� insert�� ����ǥ ������ ������ Ÿ�Կ� �°� �Է�
		return jdbcTemplate.update(sql2, boardDto.getTitle(), boardDto.getContent());
	}
}
