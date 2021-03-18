package ch13.sec05;

// ���ٽĿ��� �޼ҵ��� �Ű����� �Ǵ� ���� ������ final Ư���� ������ �ϳ�
// final Ű���� �����ص� final Ư�� (JAVA ver.8 �̻����)
public class UsingLocalVariable {
	// �Ű������� ���� �޼ҵ�
	void method(int arg) { // �Ű����� arg�� final Ư���� ����
		int localVar = 40;
		
		// ���ٽ�
		MyFunctionalInterface fi = () -> {	
			// �Ű����� ���
			System.out.println("arg: " + arg);
			// ���� ���� ���
			System.out.println("localVal: " + localVar);
		};
		fi.method();
	}
}