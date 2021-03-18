package ch12.sec07;

import ch12.sec06.Calculator;

public class User1 extends Thread {
	private Calculator calculator;

	public void setCalulator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(100);
	}
	
}
