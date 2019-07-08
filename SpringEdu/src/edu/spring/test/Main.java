package edu.spring.test;

import javax.swing.JFrame;

class Data {
	private int score;

	// 기본생성자
	Data() {
	}

	Data(int s) { // 생성자를 통해 객체를 생성할 경우 값을 수정할 수 없다.
		this.score = s;
	}

	void set(int s) {
		this.score = s;
	}
}

public class Main {
	public static void main(String[] args) {
		Data d = new Data();
		d.set(100); // 100점 저장

		//JFrame j = new JFrame("제목");

		JFrame j = new JFrame();
		j.setTitle("제목");
		j.setSize(300, 200);
		j.setVisible(true);
		

	}
}
