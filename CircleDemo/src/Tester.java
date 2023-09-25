import java.awt.*;

class Circle extends Frame implements Runnable {

	private Thread t1;
	private int x1, x2, h, w;
	
	public Circle() {
		x1 = 100;
		x2 = x1;
		h = 100;
		w = 100;
		t1 = new Thread(this, "t1");
		t1.start();
	}
	
	public void paint(Graphics g) {
		g.drawOval(x1, x2, h, w);
		g.setColor(Color.CYAN);
		g.fillOval(x1, x2, h, w);
	}
	
	@Override
	public void run() {

		int flag = 0;
		while(true) {
			if(Thread.currentThread() == t1) {
				if(flag==0) {
					x1++;
				}
				else if(flag == 1) {
					x1--;
				}
				if(x1 == this.getWidth() - 100) {
					flag = 1;
				}
				if(x1==0) {
					flag =0;
				}
				try {
					Thread.sleep(10);
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
		Circle c =  new Circle();
		c.setSize(500, 500);
		c.setVisible(true);

	}

}
