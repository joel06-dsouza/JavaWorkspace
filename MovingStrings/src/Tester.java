import java.awt.*;

class MovingString extends Frame implements Runnable
{
	private Thread t1, t2;
	private int x1, x2;

	public MovingString() {
		x1 = 100;
		x2 = 300;
		t1 = new Thread(this, "t1");
		t2 = new Thread(this, "t2");
		t1.start();
		t2.start();
	}

	public void paint(Graphics g) {
		g.setFont(new Font("Roman", 30, 30));
		g.setColor(Color.BLACK);
		g.drawString("MindCraft", x1, 100);
		g.setColor(Color.YELLOW);
		g.drawString("Softwares", x2, 100);
	}

	
	@Override
	public void run() {
		while(true)
		{
			if(Thread.currentThread() == t1) 
			{
				x1++;
				if(x1 == this.getWidth()+15) {
					x1 = 0;
					try {
						Thread.sleep(30);
					} catch (Exception e) {

					}
				}
			}
			else if(Thread.currentThread() == t2) 
			{
				x2--;
				if(x2 == 0-15) {
					x2=this.getWidth();
					try {
						Thread.sleep(3000);
					} catch (Exception e) {

					}
				}

			}
			repaint();
		}
	}
}

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovingString ms = new MovingString();
		ms.setSize(500, 500);
		ms.setVisible(true);
	}

}

