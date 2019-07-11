package edu.spring.context;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Develop {
//	@Resource(name = "develop") // Bean이 두개 이상일 때 사용
	@Autowired 
	@Qualifier("programmer") // Bean이 두개 이상일 때 사용
	private Emp emp;
	
	//  메소드를 이용한 주입방법 (emp를 주입하기 위해.) ->외부조립기에서 이것을 이용해 주입받겟다는 것을 표현해줘야 함.
	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	// emp 객체를 받아서 사용하고 잇음(Develop의 생성자). -> emp를 다른곳에서 만들어서 주입시켜줘야함.(DI라고함.) 
	public Develop(Emp emp) {
		this.emp = emp;
	}
	
	// 기본생성자
	public Develop() {}
	

	public void coding() {
		emp.gotoOffice();
		System.out.println("회사에서 일하는 중");
		emp.getOffWork();
	}
}