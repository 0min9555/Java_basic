package ch12.sec15;

public class InterruptEx {

	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		Thread.interrupted();

	}

}
