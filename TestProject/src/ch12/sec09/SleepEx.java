package ch12.sec09;

import java.awt.Toolkit;

//main 스레드가 실행 상태에서 for문 실행
// 1초간 일시 정지상태로 갔다가
// 실행 대기 상태로 변경
// 실행 상태

// 1초 간격으로 비프음과 beep 출력

public class SleepEx {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<10;i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
			} catch(InterruptedException e) { }
		}

	}

}
