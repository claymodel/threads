package sprite1;

import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

public class Sprite {
	private static int currentImage;
	private static BufferedImage[] sprites;
	private static int delayMS;
	private static Thread animation;

	public Sprite(BufferedImage sprite) {
		sprites = new BufferedImage[1];
		sprites[0] = sprite;
	}

	public Sprite(BufferedImage[] spriteAnimation, int delay) {
		this.sprites = spriteAnimation;
		currentImage = 0;
		delayMS = delay;
		// start a thread to time animation
		animation = new Thread();
		animation.start();
	}

	private static void next() {
		if (currentImage < sprites.length - 1)
			currentImage++;
		else
			currentImage = 0;
	}

	public static void main(String [] args) {
		while (Thread.currentThread() == animation) {
			// delay the animation for delayMS			
			try {
				Thread.sleep(delayMS);
			} catch (InterruptedException e) {
				break;
			}
			// next image
			next();
		}
	}

	public void draw(Graphics2D g, int x, int y) {
		g.drawImage(sprites[currentImage], null, x, y);
	}
}