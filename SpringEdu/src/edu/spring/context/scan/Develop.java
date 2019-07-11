package edu.spring.context.scan;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Develop {
//	@Resource(name = "develop") // Bean�� �ΰ� �̻��� �� ���	
	
	@Autowired 
	@Qualifier("programmer") // Bean�� �ΰ� �̻��� �� ���
	private Emp emp;
	
	public void coding() {
		emp.gotoOffice();
		System.out.println("ȸ�翡�� ���ϴ� ��");
		emp.getOffWork();
	}
}