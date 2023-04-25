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
			System.out.println("a와 b의 넓이는 같다");
		}
		else {
			System.out.println("a와 b의 넓이는 같지않다");
		}
		Rect c = new Rect(3,3);
		if(a.equals(c))
			System.out.println("a와 c의 넓이는 같다");
		else
			System.out.println("a와 c의 넓이는 같지않다.");
	}

}
