package in.mindcraft;

public class Date {
	private int dd, mm, yy;

	
	
	public Date() {
		dd=1;
		mm=8;
		yy=2001;
	}



	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void show() {
		System.out.print("Date: ");
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
}
