class Vechile implements Cloneable{
	private String vname;
	private int vnumber;
	private double cost;
	
	public Vechile() {
		vname = "";
		vnumber = 0;
		cost = 0;
	}
	
	public Vechile(String vname, int vnumber, double cost) {
		this.vname = vname;
		this.vnumber = vnumber;
		this.cost = cost;
	}
	
	public void show() {
		System.out.println(vname+" "+vnumber+" "+cost);
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class Tester {

	public static void main(String[] args) throws CloneNotSupportedException {
		Vechile v = new Vechile("BMW",12105,1111000);
		v.show();
		Vechile v2 =(Vechile)v.clone();
		v2.show();
	}

}
