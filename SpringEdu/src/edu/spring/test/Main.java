package edu.spring.test;

import javax.swing.JFrame;

class Data {
	private int score;

	// �⺻������
	Data() {
	}

	Data(int s) { // �����ڸ� ���� ��ü�� ������ ��� ���� ������ �� ����.
		this.score = s;
	}

	void set(int s) {
		this.score = s;
	}
}

public class Main {
	public static void main(String[] args) {
		Data d = new Data();
		d.set(100); // 100�� ����

		//JFrame j = new JFrame("����");

		JFrame j = new JFrame();
		j.setTitle("����");
		j.setSize(300, 200);
		j.setVisible(true);
		

	}
}
