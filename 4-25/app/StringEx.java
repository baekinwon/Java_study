package app;

public class StringEx {

	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		String str1 = "abcd";
		char data[] = {'a','b','c','d'};
		String str2 = new String(data);
		String str3 = new String("abcd");
		
		System.out.println(a+"�� ���̴� "+a.length());
		System.out.println(b+"�� ���̴� "+b.length());
		System.out.println(str1+"�� ���̴� "+str1.length());
		
		System.out.println(a.contains("#"));
		
		a= a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a);
		
		a=a.replace("C#","java");
		System.out.println(a);
		
		String s[] = a.split(",");
		for(int i =0;i<s.length;i++) {
			System.out.println("�и��� ���ڿ�"+ i + " : "+s[i]);
		}
		
	    a = a.substring(5);
	    System.out.println(a);
	    
	    char c = a.charAt(2);
	    System.out.println(c);
	    
	    str1 = str1.substring(1,2);
	    System.out.println(str1);
	}

}
