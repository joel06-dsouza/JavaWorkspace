public class Tester {
	
	public static double divide(int num, int den) throws Exception {
		
		if(den==0) {
			throw new Exception("Denominator executed...");
		}
		return (double)num/den;
	}
	

	public static void main(String[] args) {
		try {
			System.out.println(divide(12, 0));
		} catch (Exception e) {
			e.printStackTrace();	// Stack Trace mention all the calls
//			System.out.println("Denominator is zero");
		}

	}

}
