package edu.spring.context.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	// 1�� main �޼ҵ� ����
	public static void main(String[] args) {
		// 2�� �ܺ������� ����(Bean���)
		ApplicationContext con = new ClassPathXmlApplicationContext("edu/spring/context/scan/config.xml");
		// 3�� ��ϵǾ� �ִ� Bean Ȱ��
		Develop dev = (Develop) con.getBean("develop");
		dev.coding();

	}
}