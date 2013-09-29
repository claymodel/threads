package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Application {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 5; i++) {
			exec.submit(new Process(i));
		}

		System.out.println("All task submitted");
		exec.shutdown();

		try {
			exec.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("All task completed");
	}
}
