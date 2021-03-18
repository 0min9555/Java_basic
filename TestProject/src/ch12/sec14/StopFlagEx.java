package ch12.sec14;

public class StopFlagEx {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		// 1초 정지 후
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		printThread.setStop(true);
		// stop을 true로 설정
		// while(!ture) -> false -> while문 종료
		
	}

}
