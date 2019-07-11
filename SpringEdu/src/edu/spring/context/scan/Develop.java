package edu.spring.context.scan;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Develop {
//	@Resource(name = "develop") // Bean이 두개 이상일 때 사용	
	
	@Autowired 
	@Qualifier("programmer") // Bean이 두개 이상일 때 사용
	private Emp emp;
	
	public void coding() {
		emp.gotoOffice();
		System.out.println("회사에서 일하는 중");
		emp.getOffWork();
	}
}