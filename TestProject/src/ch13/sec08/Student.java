package ch13.sec08;

public class Student {
	private String name;
	private int englishScore;
	private int mathScore;
	
	// 매개변수 있는 생성자
	public Student(String name, int englishScore, int mathScore) {
		super();
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	
	// getters
	public String getName() {
		return name;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public int getMathScore() {
		return mathScore;
	}
}
