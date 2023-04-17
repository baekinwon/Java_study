package JavaPrc;

public class Beverage {
	private String name;
	
	public Beverage(String name) {this.name = name;}
	
	public void Prepare() {System.out.println("음료 준비 완료");}
	
	public void Drink_name() {System.out.println("음료는 "+name+"입니다.");}
}
