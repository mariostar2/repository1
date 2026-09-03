package tx0902;

public class Student {

	static int number;
	String name;

	int stu; // 학생번호 자동증가 변수
	String ntu;

	public Student(String name) {
		stu = --number;
		this.name = name;

	}

	// 클래스 함수
	public static void Std() {

	}

}
