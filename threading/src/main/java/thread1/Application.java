package thread1;

public class Application {
	public static void main(String[] args) {
		Runner run1 = new Runner();
		Runner run2 = new Runner();
		
		run1.start();
		run2.start();
	}
}
