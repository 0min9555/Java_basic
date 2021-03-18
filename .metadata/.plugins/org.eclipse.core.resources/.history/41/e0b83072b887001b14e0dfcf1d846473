package ch13.sec02;

// 매개변수가 1개인 람다식
// 매개값으로 2 전달
// 결과는 x*5 한 결과 출력하는 람다식 작성
// 10출력

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		
		//method 호출하면서 매개변수 값 전달
		
		fi.method(2);
		
		//실행 문장이 1개인 경우
		fi=(x)->{System.out.println(x*5);};
		fi.method(2);

		// 매개변수가 1개인 경우 괄호() 생략 가능
		// 실행 문장이 1개인 경우 중괄호{} 생략 가능
		fi = x -> System.out.println(x*5);
		fi.method(2);
	}

}
