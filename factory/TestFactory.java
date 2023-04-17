package JavaPrc;

public class TestFactory {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("PC", "2GB", "500GB", "2.4Hz");
		
		System.out.println("Factory PC Config::"+pc.toString());
		
		Computer server = ComputerFactory.getComputer("Server", "16GB", "2TB", "3.9Hz");
		
		System.out.println("Factory Server Config::"+server);
	}
}
