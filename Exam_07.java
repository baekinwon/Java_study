package Exam;

import java.util.Scanner;
import java.util.Calendar;

public class Exam_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("멈춘시간이 10초에 가장 가까운 사람이 이기는 게임입니다.");
		System.out.print("게임에 참가하는 사람은 몇명입니까 >> ");
		int people = scan.nextInt();
		String[] name = new String[people];
		
		for(int i = 0;i<people;i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			name[i] = scan.next();
		}
		
		int[] score = new int[name.length];
		for(int i = 0;i<name.length;i++) {
			System.out.println(name[i]+"시작");
			Calendar cal = Calendar.getInstance();
			int first = cal.get(Calendar.SECOND);
			
			System.out.println("멈추려면 stop을 입력하시오");
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
		System.out.println("10초에 가장 근접한 사람은"+name[x]+"입니다.");
		System.out.println("리더보드(10초와 얼마나 차이나는지)");
		for(int z = 0;z<name.length;z++) {
			System.out.println(name[z]+" : "+score[z]+"초");
		}
	}

}
