package MainPack;

public class CarUse {

	public static void main(String[] args) {
		CarClass car = CarClass.getInstance();
		
		if(car.isEnableUseCar())
			car.drive();
		else
			System.out.println("+++++ ±â´Ù·Á +++++");
	}

}
