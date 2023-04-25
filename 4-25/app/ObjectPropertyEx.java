package app;

class Point{
	private int x,y;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point( "+x+","+y+")";
	}
	@Override
	public boolean equals(Object obj) {
		Point a = (Point)obj;
		if(x == a.x&& y== a.y)
			return true;
		else return false;
	}
	
	
}

public class ObjectPropertyEx {

	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Point p = new Point(4,7);
		Point q = new Point(4,7);
		Point r = new Point(1,1);
		Point s;
		s = p;
		
		if(p == q)System.out.println("p와 q는 같다");
		else System.out.println("p와 q는 같지 않다");
		
		if(p.equals(q)) System.out.println("p와 q는 같다");
		else System.out.println("p와 q는 같지 않다.");
		
		if(p.equals(s)) System.out.println("p와 s는 같다");
		else System.out.println("p와 s는 같지않다");
		
		//print(s);
	}

}
