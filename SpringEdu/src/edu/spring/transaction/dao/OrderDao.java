package edu.spring.transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public int insertOrder(String memberId, int productId) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO JDBC_ORDER (O_ID, M_ID, P_ID) VALUES ");
		sql.append(" (NULL, ?, ?)");

		return jdbcTemplate.update(sql.toString(), memberId, productId);
	}
}