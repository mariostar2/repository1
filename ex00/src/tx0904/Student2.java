package tx0904;

public class Student2 extends School2{
	

	public static char clazz;
	//이름 반 번호 성별 과목 점수
	private int sno;
	private int kor_score;
	private int math_score;
	private int java_score;
	private int size;
	
	public void Student2() {
		return;
	}
	
	public Student2(String name,char clazz, char gender) {
		super(name,clazz,gender);
	}
	
	public int size() {
		return size;
	}
	
	public int getKor_score() {
		return kor_score;
	}
	public void setKor_score(int score) {
		kor_score =score;
	}
	
	public int getmath_score() {
		return math_score;
	}
	public void setMath_score(int score) {
		 math_score =score;
	}
	public int getJava_score() {
		return java_score;
	}
	public void setJava_score(int score) {
		java_score =score;
	}
	
	
	@Override
	public String toString() {
		return String.format("학생의 점수는 %s" +kor_score ,math_score,java_score);
	}

	public Student2 get(int i) {
		
		return null;
	}



	

	
	

}
