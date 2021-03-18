package ch12.sec08;


//TargetThread의 상태를 지속적으로 출력하는 역할하는 클래스

public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	public void run() {
		// 무한 반복하면서 스레드 상태 출력
		// TERMINATED상태가 되면 반복문 종료
		while(true) {
			//(1) 스레드 상태 출력
			//스레드 상태를 나타내는 열거 상수 문자열 반환
			Thread.State state = targetThread.getState();
			System.out.println("타켓 스레드 상태: "+state);
			
			//(2) 스레드가 새로 생성되었다면 state() 메소드 출력
			// (실행 대기 상태 또는 실행 상태로 됨)
			if(state==Thread.State.NEW) {
				targetThread.start();
			}
			
			//(3) 상태가 TERMINATED이면 반복문 종료
			if(state == Thread.State.TERMINATED) {
				break;
			}
			
			//(4) 0.5초간 일시 정지
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {}	
		}
	}
}
