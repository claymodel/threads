package step;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

public class MyObject implements Runnable {
	int x, y, direction_x, direction_y;
	Image im;
	Graphics g2;
	Color c;
	int delay;

	MyObject(int xx, int yy, int d_xx, int d_yy, Color cc, int d) {
		x = xx;
		y = yy;
		direction_x = d_xx;
		direction_y = d_yy;
		delay = d;
		new Thread(this).start();
	}

	public void MyDraw(Graphics g, JPanel p) {
		im = p.createImage(50, 50);
		g2 = im.getGraphics();
		g2.setColor(c);
		g2.fillRect(0, 0, 50, 50);
		g.drawImage(im, x, y, p);
	}

	public void run() {
		while (true) {
			x = x + 10 * direction_x;
			y = y + 10 * direction_y;

			if (x >= 150) {
				x = 150;
				direction_x = -1;
			}
			if (y >= 150) {
				y = 150;
				direction_y = -1;
			}
			if (x <= 0) {
				x = 0;
				direction_x = -1;
			}
			if (y <= 0) {
				y = 0;
				direction_y = -1;
			}

//			JPanel.repaint();

			try {
				Thread.sleep(delay);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
	}
}
