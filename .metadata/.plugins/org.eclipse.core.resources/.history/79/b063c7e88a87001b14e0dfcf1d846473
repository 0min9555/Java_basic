package ch12.sec06;

// 2개의 스레드가 calculator 객체 공유할 때 생기는 문제
//User1이 값을 100으로 설정하고 2초 대기 상태 중에
//User2가 값을 50으로 변경할 경우
//User1이 설정한 100이 아닌 변경된 값 50이 출력되는 문제

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) { }
		
		System.out.println(Thread.currentThread().getName()+" : "+this.memory);

	}
	
}
