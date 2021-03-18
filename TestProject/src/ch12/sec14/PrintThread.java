package ch12.sec14;

// 안전한 종료를 위해 stop플래그 이용
// stop 플래그로 run() 메소드의 정상 종료 유도
// run() 메소드가 종료되면 스레드 종료
// stop 값이 true 또는 false 상태인지 확인해서 종료하는 방법

public class PrintThread extends Thread {
	private boolean stop;
	
	// 외부에서 stop 값 변경 가능 : set사용
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) { // 조건이 true면 while문 종료(stop에 true인 경우)
			System.out.println("실행 중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
