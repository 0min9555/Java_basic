package ch11.sec06;

//박싱 : 기본 타입의 값을 포장 객체를 만드는 과정
//언박싱 : 포장 객체에서 기본 타입의 값을 얻어내느 과정

//박싱하는 방법
//1) 생성자 생성
//2) valueOf() 메소드 이용
public class BoxingUnBoxingEx {

	public static void main(String[] args) {
		
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		
		//Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
