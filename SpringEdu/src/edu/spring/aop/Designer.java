package edu.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Designer implements Emp {
	@Override
	public void gotoOffice() {
		System.out.println("�����̳� ���");
	}

	@Override
	public void getOffWork() {
		System.out.println("�����̳� ���");
	}
}