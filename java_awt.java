package Gohome;

import java.awt.*;

public class Exam_05 extends Frame {

	public Exam_05() {
		super("��ư");
		Panel p = new Panel();
		Button b1 = new Button();
		Button b2 = new Button("��ư 2");
		b1.setLabel("��ư1");
		p.add(b1);
		p.add(b2);
		add(p);
		setLocation(200,200);
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_05();
	}

}
