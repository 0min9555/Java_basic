package ch13.sec07;

import java.util.function.IntSupplier;

// Supplier 함수적 인터페이스
// 매개값은 없고 리턴값만 있는 추상 메소드 가짐
public class SupplierEx {

	public static void main(String[] args) {
		// int 값 리턴하는 람다식
		IntSupplier intSuplier = () -> {
			int num = (int)( Math.random()*6)+1;
			return num;
		};
		
		//추상 메소드 호출해서 결과값 저장
		int num = intSuplier.getAsInt();
		System.out.println(num);
		
		
	}

}
