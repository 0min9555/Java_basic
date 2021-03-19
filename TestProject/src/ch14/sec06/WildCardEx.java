package ch14.sec06;

import java.util.Arrays;

public class WildCardEx {
	// ���ϵ�ī�� Ÿ��: �޼ҵ��� �Ű������� ���׸� Ÿ���� ����Ҷ� 
	// ��ü���� Ÿ�� ��ſ� ���ϵ� ī��(?) ���·� ���
	
	// ���ϵ�ī�� Ÿ�� 3����
	// 1. ���׸� Ÿ��<?> : ���� ����(��� Ÿ�� �� ���� �� ����)
	// 2. ���׸�Ÿ��<? extends ����Ÿ��>: ���� Ŭ���� ����(�ְ� ������ ���� Ŭ���� ������)
	// 3. ���׸�Ÿ��<? super ����Ÿ��>: ���� Ŭ���� ����(���� ������ ���� Ŭ���� ������)
	
	
	// 1. ���׸� Ÿ��<?> : ���� ����(��� Ÿ�� �� ���� �� ����)
	// ��� Ÿ�� ���� : person, worker, students, highstudent
	public static void registerCourse(Course<?>course) {
		System.out.println(course.getName()+" ������");
		Arrays.toString(course.getStudents());
	}
	
	//2. ���׸�Ÿ��<? extends ����Ÿ��>: ���� Ŭ���� ����(�ְ� ������ ���� Ŭ���� ������)
	// �������� student, highstudent�� ����
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName()+" ������");
		Arrays.toString(course.getStudents());
	}
	
	// 3. ���׸�Ÿ��<? super ����Ÿ��>: ���� Ŭ���� ����(���� ������ ���� Ŭ���� ������)
	// �������� worker, person�� ����
	public static void registerCourseWorker(Course<? super Worker>course){
		System.out.println(course.getName()+" ������");
		Arrays.toString(course.getStudents());
	}
	
	
	public static void main(String[] args) {
		// �Ϲ��� ����
		Course<Person> personCourse = new Course<Person>("�Ϲ��ΰ���", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		
		// ������ ����
		
		// �л� ����
		
		// ����л� ����
	}

}
