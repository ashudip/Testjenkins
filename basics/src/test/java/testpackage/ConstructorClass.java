package testpackage;

public class ConstructorClass {

	int num;
	String name;
	
	public ConstructorClass(int a, String na) {
		// TODO Auto-generated constructor stub
		
		num = a;
		name = na;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorClass c = new ConstructorClass(1,"ashudeep");
		System.out.println(c.name);
		System.out.println(c.num);
		
		
		
	}

}
