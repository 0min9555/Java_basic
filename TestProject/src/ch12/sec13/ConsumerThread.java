package ch12.sec13;

// �Һ��� ������ : ������ �о(getData() �޼ҵ� ���)
public class ConsumerThread extends Thread {
	private DataBox dataBox; // ���� ��ü �ʵ�
	
	// �����ڿ��� �ʱ�ȭ
	public ConsumerThread(DataBox dataBox) {
		super();
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			String data=dataBox.getData();
		}
	}
}
