package ch12.sec10;

public class ThreadA extends Thread {
	// ���� ���¿� �۾� ���� ���¸� �˱� ���� �ʱ� �ʱ�ȭ
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) { // ������ true�� �ݺ��� ���
			if(work) { // �۾����� true��
				System.out.println("ThreadA �۾� ����");
			} else {
				Thread.yield();
				// TheadA�� ��� ���·� ����
				// ThreadA�� �켱 ������
				// �����ϰų� ���� ������ ����
			}
		}
		System.out.println("ThreadA ����");
	}
}