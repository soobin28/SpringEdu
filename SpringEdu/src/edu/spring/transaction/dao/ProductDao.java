package edu.spring.transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public int updateProduct(int productId) {
		StringBuffer sql = new StringBuffer();
		sql.append("UPDATE JDBC_PRODUCT SET ");
		sql.append(" P_COUNT = P_COUNT - 1");
		sql.append(" WHERE P_ID = ?");
		sql.append(" AND P_COUNT > 0");

		return jdbcTemplate.update(sql.toString(), productId);
	}
}