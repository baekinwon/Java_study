package Exam;

import java.util.Scanner;
import java.util.Calendar;

public class Exam_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����ð��� 10�ʿ� ���� ����� ����� �̱�� �����Դϴ�.");
		System.out.print("���ӿ� �����ϴ� ����� ����Դϱ� >> ");
		int people = scan.nextInt();
		String[] name = new String[people];
		
		for(int i = 0;i<people;i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			name[i] = scan.next();
		}
		
		int[] score = new int[name.length];
		for(int i = 0;i<name.length;i++) {
			System.out.println(name[i]+"����");
			Calendar cal = Calendar.getInstance();
			int first = cal.get(Calendar.SECOND);
			
			System.out.println("���߷��� stop�� �Է��Ͻÿ�");
			String a = scan.next();
			
			Calendar cal2 = Calendar.getInstance();
			int secon = cal2.get(Calendar.SECOND);
			if(first>secon) {
				secon+=60;
			}
			score[i] = secon-first;
		}
		
		int a = 100;
		int x=0;
		for(int j = 0;j<name.length;j++) {
			if(score[j]>10) {
				score[j] = 10-score[j];
				score[j]*=-1;
			}
			else {
				score[j] = 10-score[j];
			}
			
			if(a>score[j]) {
				a = score[j];
				x = j;
			}
		}
		System.out.println("10�ʿ� ���� ������ �����"+name[x]+"�Դϴ�.");
		System.out.println("��������(10�ʿ� �󸶳� ���̳�����)");
		for(int z = 0;z<name.length;z++) {
			System.out.println(name[z]+" : "+score[z]+"��");
		}
	}

}
