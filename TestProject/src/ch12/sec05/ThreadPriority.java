package ch12.sec05;

public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			Thread thread = new CalcThread("Thread"+i);
			
			if(i!=10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			
			thread.start();
		}
	}

}
