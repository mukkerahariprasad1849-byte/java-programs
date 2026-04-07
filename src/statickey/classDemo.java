package statickey;

public class classDemo {
static int a=10; //static variable
	
	static public void show()
	{
		System.out.println("this is static method");
	}
	static {
		System.out.println("this is static block");
	}
	
}
public class classDemo {

	public static void main(String[] args) {
			
		System.out.println(Demo.a);
		Demo.show();
	}

}


