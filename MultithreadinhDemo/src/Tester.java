import java.util.*;
//class FirstThread extends Thread{
//	public void run() {
//		for(int i=0; i<100; i++) {
//			System.out.println("Hi...");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
//
//class SecondThread extends Thread{
//	public void run() {
//		for(int i=0; i<100; i++) {
//			System.out.println("Hello...");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}

//class MyThreads implements Runnable
//{
//	private Thread t1, t2;
//	
//	public MyThreads() {		
//		t1 = new Thread(this, "first");
//		t2 = new Thread(this, "second");
//		t1.start();
//		t2.start();
//	}
//	
//	public void run() {
//		for(int i = 0; i<100; i++) {
//			if(Thread.currentThread() == t1) {
//				System.out.println("Hii!!");
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			else {
//				System.out.println("Hello");
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//}

//class Increment extends Thread {
//	private int x;
//
//	public Increment(int x) {
//		this.x = x;
//	}
//	
//	public void run() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number to get Next 10 numbers - ");
//		x=sc.nextInt();	
//		System.out.println();
//		System.out.println("The Next 10 numbers are: ");
//		for(int i=0; i<10; i++) {			
//			System.out.println(++x);
////			Thread.sleep(i)
//		}
//	}
//	
//}

//class Multiplication extends Thread {
//	private int x;
//
//	public Multiplication(int x) {
//		this.x = x;
//	}
//	
//	public void run() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number for multiplication - ");
//		x=sc.nextInt();	
//		System.out.println();
//		System.out.println("The Next 10 numbers are: ");
//		for(int i=0; i<10; i++) {			
//			System.out.println(x * i);
////			Thread.sleep(i)
//		}
//	}
//	
//}


class MyThread implements Runnable{
	private int num;
	private Thread t1, t2;
	public MyThread(int num) {
		this.num = num;
		t1 = new Thread(this, "First");
		t2 = new Thread(this, "Second");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			if(Thread.currentThread() == t1) {
				System.out.println("Incrementation: "+ (i + num));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				System.out.println("Muliplication: "+ (i * num));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
	
}

public class Tester {
	public static void main(String[] args) {
//		new MyThreads();
		
//		Increment i = new Increment(10);
//		i.start();
//		Multiplication m = new Multiplication(10);
//		m.start();
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num - ");
		num = sc.nextInt();
		MyThread m = new MyThread(num);
		
	}
}
