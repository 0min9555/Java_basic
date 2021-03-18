package ch11.sec06;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// random() : seed 값 없을 경우
		// 현재 시간을 초기값으로 해서 난수 발생
		// 실행할 때마다 다른 난수 발생
		Random random = new Random();
		
		// Random(seed) : seed 값이 있는 경우
		// seed 값을 초기값으로 하는 난수 발생
		// 매번 실행할 때마다 동일한 난수 발생
		//Random random = new Random(3);
		
		for(int i=0;i<=5;i++) {
			System.out.println(random.nextInt(10)+1);
		}
	}

}


// seed:종자값
// 난수를 만드는 알고리즘에 사용되는 값
// 종자값이 같으면 동이랗 난수 발생