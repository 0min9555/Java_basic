package ch14.sec06;

import java.util.Arrays;

public class WildCardEx {
	// 와일드카드 타입: 메소드의 매개값으로 제네릭 타입을 사용할때 
	// 구체적인 타입 대신에 와일드 카드(?) 형태로 사용
	
	// 와일드카드 타입 3가지
	// 1. 제네릭 타입<?> : 제한 없음(모든 타입 다 받을 수 있음)
	// 2. 제네릭타입<? extends 상위타입>: 상위 클래스 제한(최고 지정한 상위 클래스 까지만)
	// 3. 제네릭타입<? super 하위타입>: 하위 클래스 제한(최저 지정한 하위 클래스 까지만)
	
	
	// 1. 제네릭 타입<?> : 제한 없음(모든 타입 다 받을 수 있음)
	// 모든 타입 가능 : person, worker, students, highstudent
	public static void registerCourse(Course<?>course) {
		System.out.println(course.getName()+" 수강생");
		Arrays.toString(course.getStudents());
	}
	
	//2. 제네릭타입<? extends 상위타입>: 상위 클래스 제한(최고 지정한 상위 클래스 까지만)
	// 수강생은 student, highstudent만 가능
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName()+" 수강생");
		Arrays.toString(course.getStudents());
	}
	
	// 3. 제네릭타입<? super 하위타입>: 하위 클래스 제한(최저 지정한 하위 클래스 까지만)
	// 수강생은 worker, person만 가능
	public static void registerCourseWorker(Course<? super Worker>course){
		System.out.println(course.getName()+" 수강생");
		Arrays.toString(course.getStudents());
	}
	
	
	public static void main(String[] args) {
		// 일반인 과정
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		// 직장인 과정
		
		// 학생 과정
		
		// 고등학생 과정
	}

}
