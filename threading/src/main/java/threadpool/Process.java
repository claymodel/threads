package threadpool;

public class Process extends Thread {
	private int id;

	public Process(int id) {
		this.id = id;
	}

	public void run() {
		System.out.println("inside thread " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("completed " + id);
	}
}
