package edu.spring.test;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainTest {
	public static void main(String[] args) {
		// 외부조립기의 경로를 설정하여 불러옴. 불러오는 것을 통하여 userDao를 끄집어내서 사용할 수 있음.
		ApplicationContext context = new ClassPathXmlApplicationContext("edu/spring/test/config.xml");
		
		JdbcTemplate jt =(JdbcTemplate) context.getBean("jdbcTemplate");
		
		List<Map<String, Object>> list = jt.queryForList("SELECT * FROM EMP");
		for(int i=0;i<list.size();i++) {
			Map<String, Object> map = list.get(i);
			String ename= (String)map.get("ENAME");
			String hiredate = String.valueOf(map.get("HIREDATE"));
			System.out.printf("%s / %s \n",ename,hiredate);
		}
	}
}
