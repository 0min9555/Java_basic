package ch12.sec07;

// ����ȭ �޼ҵ� : synchronized Ű���� ����(lock(���)�� �ǹ�)
// �Ӱ� �������� �� ���� �� �����常 ���� ����
// �ٸ� ������� �޼ҵ� �Ǵ� ����� ������ ���� ������ ���

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) { }
		
		System.out.println(Thread.currentThread().getName()+" : "+this.memory);

	}
	
}
