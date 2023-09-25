abstract class Polygon{
	public abstract double calArea();
	public abstract double calPeri();
	public abstract void show();
	
}

class Circle extends Polygon{
	private int radius;
	
	public Circle() {
		radius = 1;
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double calArea() {
		return 3.14f * radius * radius;
	}
	
	public double calPeri() {
		return 2 * 3.14f * radius;
	}
	
	public void show() {
		System.out.println(calArea() +" "+calPeri());
	}
	 
}

class Rectangle extends Polygon{
	private int l, b;
	
	public Rectangle() {
		l = 1;
		b = 1;
	}

	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}
	
	public double calArea() {
		return l * b;
	}
	
	public double calPeri() {
		return 2* (l + b);
	}
	
	public void show() {
		System.out.println(calArea() +" "+calPeri());
	}
}

//class Square extends Rectangle{
//	private int s;
//	
//	public Square() {
//		s = 1;
//	}
//
//	public Square(int s) {
//		this.s = s;
//	}
//	
//	public double calArea() {
//		return s * s;
//	}
//	
//	public double calPeri() {
//		return 4 * s;
//	}
//	
//	
//}

class Square extends Rectangle{
	public Square() {
		
	}
	
	public Square(int s) {
		super(s,s);
	}
	
	public double calArea() {
		return super.calArea();
	}
	
	public double calPeri() {
		return super.calPeri();
	}
	
	public void show() {
		System.out.println(calArea() +" "+calPeri());
	}
}

public class Tester {

	public static void main(String[] args) {
		Polygon c1 = new Circle(1);
		Polygon r1 = new Rectangle(4, 2);
		Polygon s3 = new Square(3);
		c1.show();
		r1.show();
		s3.show();
		
	}

}
