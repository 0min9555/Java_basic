package ch12.sec12;

public class ThreadA extends Thread {
	private WorkObject workObject; //°øÀ¯ °´Ã¼
	
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			workObject.methodA();
		}
	}
}
