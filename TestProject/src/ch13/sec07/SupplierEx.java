package ch13.sec07;

import java.util.function.IntSupplier;

// Supplier �Լ��� �������̽�
// �Ű����� ���� ���ϰ��� �ִ� �߻� �޼ҵ� ����
public class SupplierEx {

	public static void main(String[] args) {
		// int �� �����ϴ� ���ٽ�
		IntSupplier intSuplier = () -> {
			int num = (int)( Math.random()*6)+1;
			return num;
		};
		
		//�߻� �޼ҵ� ȣ���ؼ� ����� ����
		int num = intSuplier.getAsInt();
		System.out.println(num);
		
		
	}

}
