package ch13.sec01;

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		//�������̽� ����
		MyFunctionalInterface fi;
		
		// �������̽� ���� = ���ٽ�
		// �Ű����� ����, ���ϰ��� ���� ���ٽ�
		// �Ű������� ���� ��� �ݵ�� �� ��ȣ () �־�� ��
		
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};

		//�޼ҵ� ȣ�� : ���ٽ��� �߰�ȣ { ...} ����
		fi.method();
		
		fi = () -> { System.out.println("method call2");};
		fi.method();
		
		fi = () -> System.out.println("method call3");
		fi.method();
	}

}
