package ch14.sec06;

public class Course<T> {
	private String name; // 과정명
	private T[] students; // T 타입 배열로 선언
	
	public Course(String name, int capacity) {
		this.name=name;
		students=(T[])(new Object[capacity]);
		// 타입 파라미터를 배열로 생성 방법 : (T[])(new Object[capacity])
		// 주의 : new T[] 형태로 배열을 생성할 수 없음
		// T가 결정되지 안았기 때문에 new 연산자로 배열 생성 불가
		// Object 타입으로 생성하고 T[]타입으로 강제 타입 변환
				
	}

	public String getName() {
		return name;
	}
	public T[] getStudents() {
		return students;
	}
	
	// 배열에 비어있는 부분을 찾아서 수강생을 추가
	public void add(T t) {
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				students[i]=t;
				break;
			}
		}
	}
	
}
