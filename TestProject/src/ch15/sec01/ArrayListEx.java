package ch15.sec01;

import java.util.ArrayList;

// ArrayList
// 제네릭 타입을 사용하지 않은 경우

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(5);
		
		list.add(100); // int 타입 데이터를 integer 타입으로 자동 변환
		list.add(new Integer(200)); // Integer타입 객체
		list.add(2.5);
		list.add(new Double(3.14)); // Double 타입 객체
		list.add("자바 프로그램");
		
		list.add(0, "변경"); // 0번 인덱스에 저장
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}
