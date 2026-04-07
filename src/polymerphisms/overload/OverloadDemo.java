package polymerphisms.overload;

public class OverloadDemo {
	public static void main(String[] args) {
		Overload od = new Overload();
		od.addition(10);
		od.addition(24.3f, 20000, true);
		od.addition(20, 30);
	}

}


