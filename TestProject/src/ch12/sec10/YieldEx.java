package ch12.sec10;

// 처음에는 A와 B 번걸아 가면서 실행
// 1초 정지 후
// B만 실행

public class YieldEx {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { }
		
		threadA.work = false; // B만 실행
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { }
		
		threadA.work = true; // A, B 모두 실행
	}

}
