package ch13.sec04;

public class UsingThisEx {

	public static void main(String[] args) {
		// 중첩 클래스 inner 클래서 객체 생성
		// method() 호출
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();
	}

}
