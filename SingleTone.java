package MainPack;

public class SingleTone {

    SingleTone() {};
    static SingleTone singleObj = new SingleTone();
	
	public static void main(String[] args) {
		for(int i = 0;i<5;i++) {
			SingleTone obj = new SingleTone();
			System.out.println(obj.toString());
		}
	}

}
