package MainPack;

//�̱��� - ���������� ��������
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

