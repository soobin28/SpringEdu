package edu.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	// 1�� main �޼ҵ� ����
	public static void main(String[] args) {
		// 2�� �ܺ������� ����(Bean���)
		ApplicationContext con = new ClassPathXmlApplicationContext("edu/spring/bean/config.xml");
		// 3�� ��ϵǾ� �ִ� Bean Ȱ��?
		Develop dev = (Develop) con.getBean("develop");
		dev.coding();
		
		Develop dev2 =(Develop) con.getBean("develop2");
		dev2.coding();
	}
}