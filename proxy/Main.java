package JavaPrc;

interface IService{
	String runSomthing();
}

class Service implements IService {

	@Override
	public String runSomthing() {
		return "���� ��";
	}
	
}

class Proxy implements IService{
	IService service1;

	@Override
	public String runSomthing() {
		System.out.println("ȣ�⿡ ���� �帧 ��� �ָ���, ��ȯ ����� �״�� ����");
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
