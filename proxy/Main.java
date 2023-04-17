package JavaPrc;

interface IService{
	String runSomthing();
}

class Service implements IService {

	@Override
	public String runSomthing() {
		return "서비스 굿";
	}
	
}

class Proxy implements IService{
	IService service1;

	@Override
	public String runSomthing() {
		System.out.println("호출에 대한 흐름 제어가 주목적, 반환 결과를 그대로 전달");
		service1 = new Service();
		return service1.runSomthing();
	}
	
}

public class Main {

	public static void main(String[] args) {
		IService service = new Service();
		System.out.println(service.runSomthing());
		
		IService proxy = new Proxy();
		proxy.runSomthing();
	}

}
