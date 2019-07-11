package edu.spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	// 1�� main �޼ҵ� ����
	public static void main(String[] args) {
		// 2�� �ܺ������� ����(Bean���)
		ApplicationContext con = new ClassPathXmlApplicationContext("edu/spring/context/config.xml");
		// 3�� ��ϵǾ� �ִ� Bean Ȱ��
		Develop dev = (Develop) con.getBean("develop");
		dev.coding();

	}
}