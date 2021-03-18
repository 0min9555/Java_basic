package ch12.sec11;

public class JoinEx {

	public static void main(String[] args) {
		SumThread sumthread = new SumThread();
		sumthread.start();
		
		try {
			sumthread.join();
		} catch (InterruptedException e) { }
		// join() 메소드를 호출하면
		// main 스레드는 일시 정지 상태가 되고
		// sumThread의 run() 메소드가 수행 후 종료하면
		// main 스레드가 다시 실행 대기 상태로 가서 실행

		
		System.out.println("1~100 합 : "+sumthread.getSum()); 
		// sumThread에 대해서 join() 메소도를 호출하지 않고
		// main에서 getSum() 해서 바로 출력할 경우
		// sumThread의 run() 메소드가 종료되지 않는 상태에서
		// 결과가 출력할 수 없을 수도 있음

	}

}
