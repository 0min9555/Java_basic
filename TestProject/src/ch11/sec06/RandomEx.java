package ch11.sec06;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// random() : seed �� ���� ���
		// ���� �ð��� �ʱⰪ���� �ؼ� ���� �߻�
		// ������ ������ �ٸ� ���� �߻�
		Random random = new Random();
		
		// Random(seed) : seed ���� �ִ� ���
		// seed ���� �ʱⰪ���� �ϴ� ���� �߻�
		// �Ź� ������ ������ ������ ���� �߻�
		//Random random = new Random(3);
		
		for(int i=0;i<=5;i++) {
			System.out.println(random.nextInt(10)+1);
		}
	}

}


// seed:���ڰ�
// ������ ����� �˰��� ���Ǵ� ��
// ���ڰ��� ������ ���̶� ���� �߻�