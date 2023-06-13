package MainPack;

//싱글톤 - 디자인패턴 생성패턴
public class CarClass{
	private CarClass() {}
	
	private static CarClass car = new CarClass();
	
	public static CarClass getInstance() {return car;}
	
	private static boolean isUse = false;
	
	public static void drive() {
		isUse = true;
		System.out.println("Strart driving");
	}
	public static void parking() {
		isUse = false;
		System.out.println("parking");
	}
	
	public static boolean isEnableUseCar() {return !isUse;}
	
}

