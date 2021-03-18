package ch12.sec13;

// ������ 2�� (������ ������, �Һ��� ������)
// ������ ������ : ������ ����(����) setData() �޼ҵ� ���
// �Һ��� ������ : ������ �Һ�(�б�) getData() �޼ҵ� ���

// ���� ����� �۾�(����/�б� �۾� �����)
// ������ �����尡 �����͸� �����ϸ� notify() �˸�(�о� �����) �ڱ�� �Ͻ� ����
// �Һ��� ������ ������ �о�� notify() �˸�(�� ������ �����϶��) �ڱ�� �Ͻ� ����

// ���� ������ Ŭ����
public class DataBox {
	private String data; // ������ �����ϱ� ���� �ʵ�

	public synchronized String getData() {
		// data�� null�̸� (���� ������ ����)
		// �Һ��� ������� �Ͻ��������·� ����
		if(this.data == null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		
		// ������ �а�, �� ���� �Ŀ� data�� null�� ����
		String returnValue = data;
		System.out.println("�Һ��� �����尡 ���� ������ : "+returnValue);
		data=null;
		// notify()�˸�
		notify();
		// ������ �����带 wait ���¿��� ���� ��� ���·� ����
		// ������ �����尡 �ٽ� �����͸� ������ �� �ֵ��� �ϱ� ���ؼ�
		// �� �о����ϱ� ���� �ٽ� �����϶�� �ϴ� ����		
		
		// ���� ������ ����
		return data;
	}
	
	// ������ ������ ���
	public synchronized void setData(String data) {
		// data �ʵ尡 null�� �ƴϸ� (�Һ��ڰ� ���� �� ���� ��)
		// ������ �����带 �Ͻ� ���� ���·� ����
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		this.data = data; //data�� ���� ����
		System.out.println("������ �����尡 ������ ������ : "+data);
		
		// �Һ��� �����带 wait���¿��� ���� ��� ���·� ����
		// (�����͸� ���� ���������ϱ� �о��� �˸�)
		notify();
	}
	
}
