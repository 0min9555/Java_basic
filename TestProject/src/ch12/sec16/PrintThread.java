package ch12.sec16;

public class PrintThread extends Thread {
	
	@Override
	public void run() {
		
		/*
		// 방법 1
		// Thread의 정적메소드 interrupted() 사용
		while(true) {
			System.out.println("실행 중");
			
			// 일시 정지 상태 없는 경우
			// interrupt된 상태인지를 확인하고
			// interrupt 되었으면 정료
			// interrupted() 메소드 또는 isInterrupted() 메소드 사용
			// Thread.interrupted() : interrupted()는 Thread의 정적메소드
			
			
			if(Thread.interrupted()) { // interrupt 되었으면 정료
				break; // while문 종료
			}
		}
		*/
		
		// 방법2
		// isInterrupted() 메소드 사용
		// Thread 클래스이 인스턴스 메소드 isInterrupted() 사용
		// PrintThread가 Thread 클래스를 상속 받았으므로 Thread 인스턴스 메소드 사용 가능
		while(true) {
			System.out.println("실행 중");
			if(isInterrupted()) {
				break;
			}
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
