package edu.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository // 자동으로 Bean 등록이 됨. (다른 곳에서 Autowried를 통해 사용가능)
public class MemberDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public int insertMember(MemberDto memberDto) {
		String sql = "INSERT INTO JDBC_MEMBER VALUES (?, ?, ?, SYSDATE())";
		// 앞에 쿼리문이 들어가고 insert할 물음표 갯수와 데이터 타입에 맞게 입력
		return jdbcTemplate.update(sql, memberDto.getId(), memberDto.getPw(), memberDto.getName());
	}
}