package thread1;

public class Runner extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("inside " + Thread.currentThread().getName() +" thread " + i);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
