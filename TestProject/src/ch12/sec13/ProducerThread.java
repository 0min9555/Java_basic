package ch12.sec13;
// 생산자 스레드 : 데이터 저장(setData() 사용)
public class ProducerThread extends Thread {
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			String data= "Date-"+i;
			dataBox.setData(data);
		}
	}
	
	
}
