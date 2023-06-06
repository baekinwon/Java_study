package Gohome;

import java.awt.*;

public class Exam_03 extends Frame {

	public Exam_03() {
		super("Panel");
		Panel p = new Panel();
		p.setBackground(Color.blue);
		add(p);
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_03();
	}

}
