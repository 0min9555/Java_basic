package ch13.sec04;

public class UsingThisEx {

	public static void main(String[] args) {
		// ��ø Ŭ���� inner Ŭ���� ��ü ����
		// method() ȣ��
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();
	}

}