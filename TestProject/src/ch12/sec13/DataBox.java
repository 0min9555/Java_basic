package ch12.sec13;

// 스레드 2개 (생산자 스레드, 소비자 스레드)
// 생산자 스레드 : 데이터 생산(저장) setData() 메소드 사용
// 소비자 스레드 : 데이터 소비(읽기) getData() 메소드 사용

// 서로 교대로 작업(저장/읽기 작업 교대로)
// 생산자 스레드가 데이터를 저장하면 notify() 알림(읽어 가라고) 자기는 일시 정지
// 소비자 스레드 데이터 읽어가면 notify() 알림(새 데이터 저장하라고) 자기는 일시 정지

// 공유 데이터 클래스
public class DataBox {
	private String data; // 데이터 저장하기 위한 필드

	public synchronized String getData() {
		// data가 null이면 (읽을 데이터 없음)
		// 소비자 스레드는 일시정지상태로 변경
		if(this.data == null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		
		// 데이터 읽고, 다 읽은 후에 data를 null로 만듦
		String returnValue = data;
		System.out.println("소비자 스레드가 읽은 데이터 : "+returnValue);
		data=null;
		// notify()알림
		notify();
		// 생산자 스레드를 wait 상태에서 실행 대기 상태로 변경
		// 생산자 스레드가 다시 데이터를 저장할 수 있도록 하기 위해서
		// 다 읽었으니까 새로 다시 저장하라고 하는 것임		
		
		// 읽을 데이터 리턴
		return data;
	}
	
	// 생산자 스레드 사용
	public synchronized void setData(String data) {
		// data 필드가 null이 아니면 (소비자가 아직 안 읽은 것)
		// 생산자 스레드를 일시 정지 상태로 변경
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		this.data = data; //data를 새로 저장
		System.out.println("생산자 스레드가 생성한 데이터 : "+data);
		
		// 소비자 스레드를 wait상태에서 실행 대기 상태로 변경
		// (데이터를 새로 저장했으니까 읽어가라고 알림)
		notify();
	}
	
}
