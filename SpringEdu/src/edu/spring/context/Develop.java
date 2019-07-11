package edu.spring.context;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Develop {
//	@Resource(name = "develop") // Bean�� �ΰ� �̻��� �� ���
	@Autowired 
	@Qualifier("programmer") // Bean�� �ΰ� �̻��� �� ���
	private Emp emp;
	
	//  �޼ҵ带 �̿��� ���Թ�� (emp�� �����ϱ� ����.) ->�ܺ������⿡�� �̰��� �̿��� ���Թްٴٴ� ���� ǥ������� ��.
	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	// emp ��ü�� �޾Ƽ� ����ϰ� ����(Develop�� ������). -> emp�� �ٸ������� ���� ���Խ��������.(DI�����.) 
	public Develop(Emp emp) {
		this.emp = emp;
	}
	
	// �⺻������
	public Develop() {}
	

	public void coding() {
		emp.gotoOffice();
		System.out.println("ȸ�翡�� ���ϴ� ��");
		emp.getOffWork();
	}
}