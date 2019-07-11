package edu.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository // �ڵ����� Bean ����� ��. (�ٸ� ������ Autowried�� ���� ��밡��)
public class MemberDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public int insertMember(MemberDto memberDto) {
		String sql = "INSERT INTO JDBC_MEMBER VALUES (?, ?, ?, SYSDATE())";
		// �տ� �������� ���� insert�� ����ǥ ������ ������ Ÿ�Կ� �°� �Է�
		return jdbcTemplate.update(sql, memberDto.getId(), memberDto.getPw(), memberDto.getName());
	}
}