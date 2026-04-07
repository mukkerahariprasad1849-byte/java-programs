package polymerphisms.overriden;

public class OverridenDemo {
	public static void main(String[] args) {
		RBI r = new RBI();
		r.rateofInterest();
		
		RBI ra = new Axis();  //
		ra.rateofInterest();
		
		RBI rs = new SBI();
		rs.rateofInterest();
		
		RBI rh = new HDFC();
		rh.rateofInterest();

	}

}


