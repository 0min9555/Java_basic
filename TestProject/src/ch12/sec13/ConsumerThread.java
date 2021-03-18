package ch12.sec13;

// 소비자 스레드 : 데이터 읽어감(getData() 메소드 사용)
public class ConsumerThread extends Thread {
	private DataBox dataBox; // 공유 객체 필드
	
	// 생성자에서 초기화
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
