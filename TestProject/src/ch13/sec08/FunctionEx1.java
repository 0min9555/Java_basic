package ch13.sec08;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionEx1 {
	
	//Student ��ü�� ���� �÷��� (���� ��ü�� ���� ���� ��ü) ����
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿",90,95),
			new Student("�ſ��",95,93)
	);
	
	//int Ÿ�� ��� �޼ҵ� ����
	//�Ű������� ToIntFunction �Լ��� �������̽� Ÿ�� ���
	// �Ű����� Student�� �޾Ƽ� int�� ����
	public static void printInt(ToIntFunction<Student>function) {
		for(Student student : list) {
			// ��µǴ� ���� printInt()�� �Ű������� ���޵Ǵ� ���ٽĿ� ���� �޶���
			System.out.println(function.applyAsInt(student)+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
