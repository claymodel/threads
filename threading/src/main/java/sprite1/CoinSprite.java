package sprite1;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CoinSprite {

	private BufferedImage img;
	private int speedKeyX, speedKeyY;
	private int x;
	private int y;

	public CoinSprite() {
	}

	public CoinSprite(String fileLoc, int x, int y) {
		try {
			this.img = ImageIO.read(new File(fileLoc));
		} catch (IOException e) {
			System.out.println("Can't load file!");
		}

		this.x = x;
		this.y = y;
	}

	/*
	 * move the sprite based on key inputs
	 */
	public void move2() {
		this.x += this.speedKeyX;
		this.y += this.speedKeyY;
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			speedKeyX = -1; // when move is, called change the speed
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			speedKeyX = 1;
		}
	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			speedKeyX = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			speedKeyX = 0;
		}
	}

	// GETTERS
	public BufferedImage getImage() {
		return this.img;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	// SETTERS
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
}