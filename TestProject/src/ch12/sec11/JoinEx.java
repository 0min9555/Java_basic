package ch12.sec11;

public class JoinEx {

	public static void main(String[] args) {
		SumThread sumthread = new SumThread();
		sumthread.start();
		
		try {
			sumthread.join();
		} catch (InterruptedException e) { }
		// join() �޼ҵ带 ȣ���ϸ�
		// main ������� �Ͻ� ���� ���°� �ǰ�
		// sumThread�� run() �޼ҵ尡 ���� �� �����ϸ�
		// main �����尡 �ٽ� ���� ��� ���·� ���� ����

		
		System.out.println("1~100 �� : "+sumthread.getSum()); 
		// sumThread�� ���ؼ� join() �޼ҵ��� ȣ������ �ʰ�
		// main���� getSum() �ؼ� �ٷ� ����� ���
		// sumThread�� run() �޼ҵ尡 ������� �ʴ� ���¿���
		// ����� ����� �� ���� ���� ����

	}

}
