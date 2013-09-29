package sprite1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

public class Spriter extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6833023292004560677L;
	private static CoinSprite coin2;
	private Thread animate;

	private final static int DELAY = 25;

	public Spriter() {
		setBackground(Color.BLACK);
		this.addKeyListener(new InputHandler());

		coin2 = new CoinSprite("images/coin.gif", 25, 25);
		animate = new Thread();
		animate.start();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(coin2.getImage(), coin2.getX(), coin2.getY(), null);
	}

	/**
	 * public void main(String [] args) { long beforeTime, timeDiff, sleep;
	 * 
	 * beforeTime = System.currentTimeMillis();
	 * 
	 * while (true) { coin2.move2(); // move the 2nd coin based on the
	 * inputHandler repaint();
	 * 
	 * timeDiff = System.currentTimeMillis() - beforeTime; sleep = DELAY -
	 * timeDiff;
	 * 
	 * if (sleep < 0) sleep = 2;
	 * 
	 * try { Thread.sleep(sleep); } catch (InterruptedException e) {
	 * System.out.println("Animation interrupted!"); }
	 * 
	 * beforeTime = System.currentTimeMillis(); } }
	 */

	public static void main(String[] args) {
		long beforeTime, timeDiff, sleep;
		beforeTime = System.currentTimeMillis();

		while (true) {
			coin2.move2(); // move the 2nd coin based on the inputHandler
			// repaint();

			timeDiff = System.currentTimeMillis() - beforeTime;
			sleep = DELAY - timeDiff;

			if (sleep < 0)
				sleep = 2;

			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				System.out.println("Animation interrupted!");
			}

			beforeTime = System.currentTimeMillis();
		}

	}

	/*
	 * create a inner class to handle key inputs via the CoinSprite class
	 */
	private class InputHandler extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			coin2.keyPressed(e);
		}

		public void keyReleased(KeyEvent e) {
			coin2.keyReleased(e);
		}
	}

}