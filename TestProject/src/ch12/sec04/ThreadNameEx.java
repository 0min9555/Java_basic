package ch12.sec04;

public class ThreadNameEx {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.print("프로그램 시작 스레드 이름 : " + mainThread.getName());
		
		/*
		ThreadA threadA = new ThreadA();
		System.out.println("작업스레드 이름 : " + threadA.getName());
		threadA.start(); //run() 메소드 호출
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업스레드 이름 : " + threadB.getName());
		threadA.start(); //run() 메소드 호출
		
		ThreadC threadC = new ThreadC();
		System.out.println("작업스레드 이름 : " + threadC.getName());
		threadC.start(); //run() 메소드 호출
		*/
		
		
	}

}
