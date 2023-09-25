import java.awt.*;

@SuppressWarnings("serial")
class MovingCircle extends Frame implements Runnable{

	private int x1, x2,x3;
	
	private Thread t1, t2, t3;
	
	public MovingCircle() {
		x1 = x2 = x3 = 100 ;
		t1 = new Thread(this, "c1");
		t2 = new Thread(this, "c2");
		t3 = new Thread(this, "c3");
		t1.start();
		t2.start();
		t3.start();
	}
	
	public void paint(Graphics g) {
		
		g.setColor(Color.RED);
		g.fillOval(x1, 100, 100, 100);
		g.setColor(Color.BLUE);
		g.fillOval(x2, 250, 100, 100);
		g.setColor(Color.GREEN);
		g.fillOval(x3, 400, 100, 100);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(Thread.currentThread() == t1) {
				synchronized (this) {
					x1++;
					if(x1==this.getWidth() - 100)
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else if(Thread.currentThread() == t2) {
				synchronized (this) {
					x2++;
					if(x2 == this.getWidth() - 100) {						
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				try {
					Thread.sleep(60);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(Thread.currentThread() == t3) {
				synchronized (this) {
					x3++;
					if(x3 == this.getWidth() - 100) {
						x1=x2=x3=0;
						notifyAll();
					}
				}
				try {
					Thread.sleep(90);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			repaint();
		}
	}
}

public class Tester {

	public static void main(String[] args) {
		MovingCircle mc = new MovingCircle();
		mc.setSize(600, 600);
		mc.setVisible(true);

	}

}
