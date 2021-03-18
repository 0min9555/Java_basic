package ch12.sec16;

public class PrintThread extends Thread {
	
	@Override
	public void run() {
		
		/*
		// ��� 1
		// Thread�� �����޼ҵ� interrupted() ���
		while(true) {
			System.out.println("���� ��");
			
			// �Ͻ� ���� ���� ���� ���
			// interrupt�� ���������� Ȯ���ϰ�
			// interrupt �Ǿ����� ����
			// interrupted() �޼ҵ� �Ǵ� isInterrupted() �޼ҵ� ���
			// Thread.interrupted() : interrupted()�� Thread�� �����޼ҵ�
			
			
			if(Thread.interrupted()) { // interrupt �Ǿ����� ����
				break; // while�� ����
			}
		}
		*/
		
		// ���2
		// isInterrupted() �޼ҵ� ���
		// Thread Ŭ������ �ν��Ͻ� �޼ҵ� isInterrupted() ���
		// PrintThread�� Thread Ŭ������ ��� �޾����Ƿ� Thread �ν��Ͻ� �޼ҵ� ��� ����
		while(true) {
			System.out.println("���� ��");
			if(isInterrupted()) {
				break;
			}
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
