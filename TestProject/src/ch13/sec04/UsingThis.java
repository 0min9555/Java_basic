package ch13.sec04;
	// ���ٽ� ���� ��Ͽ��� Ŭ���� �ɹ�(�ʵ�, �޼ҵ�)�� ���� ���� ���

public class UsingThis {
	public int outterField=10;
	
	class Inner{
		int innerField=20;
		int field=200;
		
		void method() {
			//���ٽ�
			MyFunctionalInterface fi = () -> {
				// �ʵ���� �ٸ� ��� �ƹ� ���� ����
				System.out.println("outterField : " + outterField);
				System.out.println("outterField : " + UsingThis.this.outterField + "\n");
				
				// �ʵ���� ������ ���
				System.out.println("innerField : " + field);
				System.out.println("innerField : " + field + "\n");
				
				// �ٱ� Ŭ���� �ʵ� ��� : Ŭ������.this ���
				System.out.println("innerField : " + innerField);
				
				//this�� ����� ��� : Inner Ŭ���� �ʵ尪
				// ���ٽĿ��� this : ���ٽ��� ������ ��ü ����
				System.out.println("innerField : " + this.innerField + "\n");
			};
			fi.method();
		}
	}
}
