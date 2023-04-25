package app;

class Rect{
	private int x,y;
	public Rect(int x,int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		Rect r = (Rect)obj;
		if((x*y)==(r.x*r.y))
			return true;
		else
			return false;
	}
	
}

public class EqualsEx {

	public static void main(String[] args) {
		Rect a= new Rect(4,5);
		Rect b = new Rect(2,10);
		if(a.equals(b)) {
			System.out.println("a�� b�� ���̴� ����");
		}
		else {
			System.out.println("a�� b�� ���̴� �����ʴ�");
		}
		Rect c = new Rect(3,3);
		if(a.equals(c))
			System.out.println("a�� c�� ���̴� ����");
		else
			System.out.println("a�� c�� ���̴� �����ʴ�.");
	}

}
