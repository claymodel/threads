package volatilethread;

public class Processor extends Thread {
	private volatile boolean running = true;

	public void run() {
		while (running) {
			System.out.println("Running..." + Thread.currentThread().getName());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.getStackTrace();
			}
		}
	}
	
	public void shutDown() {
		running = false;
	}
}
