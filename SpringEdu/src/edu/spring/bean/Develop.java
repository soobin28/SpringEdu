package edu.spring.bean;

public class Develop {
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