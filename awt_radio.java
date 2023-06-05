package Gohome;

import java.awt.*;

public class Exam_07 extends Frame {

	public Exam_07() {
		super("라디오버튼형");
		Panel p = new Panel();
		//체크박스를 그룹으로 묶음. 그룹 내에서는 하나의 항목만 선택
		CheckboxGroup g = new CheckboxGroup();
		Checkbox ra1 = new Checkbox("여자",g,false);
		Checkbox ra2 = new Checkbox("남자",g,true);
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
