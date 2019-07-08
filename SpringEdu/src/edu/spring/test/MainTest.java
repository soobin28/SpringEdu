package edu.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		// 외부조립기의 경로를 설정하여 불러옴. 불러오는 것을 통하여  userDao를 끄집어내서 사용할 수 있음.
		ApplicationContext context = new ClassPathXmlApplicationContext("edu/spring/test/config.xml");
		Email email = context.getBean("email",Email.class);
		email.send();
		
		Email eee = new Email(); // Spring에서 권장하지 않는 방법.
		
		UserDao userDao = (UserDao) context.getBean("userDao");
		System.out.println(userDao.getUserInfo());

		UserDao userDao2 = context.getBean("userDao", UserDao.class);
		System.out.println(userDao2.getUserInfo());

		System.out.println(userDao == userDao2);
		
	}
}
