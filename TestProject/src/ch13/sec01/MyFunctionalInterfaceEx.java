package ch13.sec01;

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		//인터페이스 변수
		MyFunctionalInterface fi;
		
		// 인터페이스 변수 = 람다식
		// 매개변수 없고, 리턴값도 없는 람다식
		// 매개변수가 없는 경우 반드시 빈 괄호 () 있어야 함
		
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};

		//메소드 호출 : 람다식의 중괄호 { ...} 실행
		fi.method();
		
		fi = () -> { System.out.println("method call2");};
		fi.method();
		
		fi = () -> System.out.println("method call3");
		fi.method();
	}

}
