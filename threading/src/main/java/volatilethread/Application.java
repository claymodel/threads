package volatilethread;

import java.util.Scanner;

public class Application {
	public static void main(String [] args){
		Processor process1 = new Processor();
		
		process1.start();
		
		new Scanner(System.in).nextLine();
		process1.shutDown();
	}
}
