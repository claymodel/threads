package consumerproducer;

public class Consumer extends Thread {
	private int n;
	private Buffer consBuf;

	public Consumer(int m, Buffer buf) {
		n = m;
		consBuf = buf;
	}

	public void run() {
		int value;
		for (int i=0;i<n;i++){
			try {
				value = consBuf.get();
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			try{
				Thread.sleep((int) Math.random() * 100);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
