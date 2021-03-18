package ch13.sec04;
	// 람다식 실행 블록에서 클래스 맴버(필드, 메소드)와 로컬 변수 사용

public class UsingThis {
	public int outterField=10;
	
	class Inner{
		int innerField=20;
		int field=200;
		
		void method() {
			//람다식
			MyFunctionalInterface fi = () -> {
				// 필드명이 다를 경우 아무 문제 없음
				System.out.println("outterField : " + outterField);
				System.out.println("outterField : " + UsingThis.this.outterField + "\n");
				
				// 필드명이 동일한 경우
				System.out.println("innerField : " + field);
				System.out.println("innerField : " + field + "\n");
				
				// 바깥 클래스 필드 출력 : 클래스명.this 사용
				System.out.println("innerField : " + innerField);
				
				//this만 사용한 경우 : Inner 클래스 필드값
				// 람다식에서 this : 람다식을 실행한 객체 생성
				System.out.println("innerField : " + this.innerField + "\n");
			};
			fi.method();
		}
	}
}
