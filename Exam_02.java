package GoodMorning;
import java.util.Scanner;

abstract class Shape1{

	public abstract int height();
	public abstract void draw();
	void print() {
		System.out.println(height());
		draw();
	}
}

class num1 extends Shape1{
	num1(){};
	int he;
	num1(int h){
		this.he = h;
	}
	@Override
	public int height() {
		return he;
	}
	@Override
	public void draw() {
		for(int i = 0;i<=height();i++) {
			for(int j = 0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
class num2 extends Shape1{
	num2(){};
	int he;
	num2(int h){
		this.he = h;
	}
	@Override
	public int height() {
		return he;
	}
	@Override
	public void draw() {
		for(int i = height();i>0;i--) {
			for(int x = i;x>=0;x--) {
				System.out.print(" ");
			}
			for(int j = height();j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
class num3 extends Shape1{
	int he;
	num3(int h){
		this.he = h;
	}
	@Override
	public int height() {
		return he;
	}
	@Override
	public void draw() {
		for(int i = 0;i<height();i++) {
			for(int x = 1;x<=height()-i;x++) {
				System.out.print(" ");
			}
			for(int j = 0;j<=i*2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}

/*class triangle extends Shape1{
	int he,num;
	triangle(){};
	triangle(int n,int h){
		this.he= h;
		this.num = n;
	}
	@Override
	public int height() {
		return he;
	}

	@Override
	public void draw() {
		if(num==1) {
			for(int i = 0;i<=height();i++) {
				for(int j = 0;j<i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else if(num==2) {
			for(int i = height();i>0;i--) {
				for(int x = i;x>=0;x--) {
					System.out.print(" ");
				}
				for(int j = height();j>=i;j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else if(num==3) {
			for(int i = 0;i<height();i++) {
				for(int x = 1;x<=height()-i;x++) {
					System.out.print(" ");
				}
				for(int j = 0;j<=i*2;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
	
}*/
public class Exam_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("삼각형 번호 입력>>");
		int a = scan.nextInt();
		System.out.print("높이 입력>>");
		int b = scan.nextInt();
		/*triangle t = new triangle(a,b);
		t.print();*/
		switch(a) {
		case 1:
			num1 n1 = new num1(b);
			n1.print();
			break;
		case 2:
			num2 n2 = new num2(b);
			n2.print();
			break;
		case 3:
			num3 n3 = new num3(b);
			n3.print();
			break;
		default:
			System.out.println("에러");
		}
	}

}
