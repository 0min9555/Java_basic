package ch13.sec06;

public class RunnableEx {

	public static void main(String[] args) {
		Runnable runnalbe = () -> {
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}
		};
		Thread thread = new Thread(runnalbe);
		thread.start();
	}

}
