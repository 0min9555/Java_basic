package ch12.sec13;

public class WaitNotifyEx {

	public static void main(String[] args) {
		// 공유 객체 생성
		DataBox dataBox = new DataBox();
		
		// 생성자 스레드 생성
		ProducerThread producerThread = new ProducerThread(dataBox);
		
		// 소비자 스레드 생성
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();

	}

}
