package Gohome;

import java.awt.*;

public class Exam_07 extends Frame {

	public Exam_07() {
		super("������ư��");
		Panel p = new Panel();
		//üũ�ڽ��� �׷����� ����. �׷� �������� �ϳ��� �׸� ����
		CheckboxGroup g = new CheckboxGroup();
		Checkbox ra1 = new Checkbox("����",g,false);
		Checkbox ra2 = new Checkbox("����",g,true);
		p.add(ra1);
		p.add(ra2);
		add(p);
		setSize(300,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_07();
	}

}
