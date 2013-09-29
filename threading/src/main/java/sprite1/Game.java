package sprite1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Game extends JFrame implements KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7359676248782443853L;
	char input;
	JFrame f = new JFrame();
	Draw d = new Draw();

	int x, y = 0; // x and y position of ellipse

	public Game() {
		f.setTitle("Game");
		f.setSize(1430, 800);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.add(d);
		f.addKeyListener(this);
		f.setFocusable(true);
		f.setVisible(true);
	}

	public void keyTyped(KeyEvent e) {

		input = e.getKeyChar();
		move(d);
	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	public void move(Draw d) {
		if (input == 'w') {
			y -= 5;
		} else if (input == 'a') {
			x -= 5;
		} else if (input == 's') {
			y += 5;
		} else if (input == 'd') {
			x += 5;
		}

		d.setLocation(x, y);
		f.repaint();
	}

	public static void main(String[] args) {
		Game g = new Game();

	}

}