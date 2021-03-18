package ch12.sec15;

public class PrintThread extends Thread {
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1);
				
				//일시 정지 상태가 없으면
				//interrup 호출
			}
		} catch (InterruptedException e) {}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
