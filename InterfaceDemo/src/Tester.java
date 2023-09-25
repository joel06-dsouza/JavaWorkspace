interface printable{
	public void printDetails();
}

class Cricket implements printable{
	private String cname;
	private int runs;
	
	
	public Cricket() {
		cname = "Joel";
		runs= 3500;
	}


	public Cricket(String name, int runs) {
		this.cname = name;
		this.runs = runs;
	}
	
	public void printDetails() {
		System.out.println(cname+" "+runs);
	}
}


class Football implements printable{
	private String fname;
	private int goals;
	
	public Football() {
		fname = "Messi";
		goals = 400;
	}

	public Football(String fname, int goals) {
	
		this.fname = fname;
		this.goals = goals;
	}
	
	public void printDetails() {
		System.out.println(fname+" "+goals);
	}
	
}

public class Tester {
	public static void main(String[] args) {
		Cricket c = new Cricket();
		c.printDetails();
		Football f = new Football();
		f.printDetails();
		
	}
}
