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
		// 앞에 쿼리문이 들어가고 insert할 물음표 갯수와 데이터 타입에 맞게 입력
		return jdbcTemplate.update(sql2, boardDto.getTitle(), boardDto.getContent());
	}
}
