package cs2;

import java.awt.Color;

public class MoveThread implements Runnable {

	Thread runner;
	private PictureView view;

	public MoveThread() {

	}

	public MoveThread(String str) {
		runner = new Thread(this);
		int i = 0;
		i++;
		double theta = 2.0 * Math.PI * i / 50.0;

		if (str.equalsIgnoreCase("id")) {
			int id = view.create(100, 100, 0, 20, PictureView.ROUND,
					Color.YELLOW);
			view.move(id, 300.0 * Math.cos(theta + 1.0), 10,
					300.0 * Math.sin(theta + 1.0) + 300);
		} else if (str.equalsIgnoreCase("id2")) {

			int id2 = view.create(-100, -150, 0, 20, PictureView.DIAMOND,
					Color.BLUE);

			view.move(id2, 30, 300.0 * Math.cos(theta),
					250.0 * Math.sin(theta) + 250);
		}
		runner.start();
	}

	public void run() {
	}
}
