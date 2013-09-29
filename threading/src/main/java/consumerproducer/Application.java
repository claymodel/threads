package consumerproducer;

public class Application {
	public static void main(String[] args) {
		Buffer buf = new Buffer();
		Producer prod = new Producer(10, buf);
		Consumer cons = new Consumer(10, buf);
		
		prod.start();
		cons.start();
		
		try {
			prod.join();
			cons.join();
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
