package tx0904;

/*
**학생**
반:A,B,C
이름:?
필수 수강 과목: 국어, 수학 ,java
선택 수강 과목: SQL. HTML
성별: ? 
*/

public class Student extends School {
	private String classname; 
	private String name; 
	private String gender;
	private int kor_Score;
	private int math_Score;
	private int java_Score;
	private int sql;
	private int html;
	
	public Student(String classname, String name, String gender, int korScore, int mathScore, int javaScore, int sql,int html) {
		this.classname = classname;
		this.name = name;
		this.gender = gender;
		this.kor_Score = korScore;
		this.math_Score = mathScore;
		this.java_Score = javaScore;
		this.sql = sql;
		this.html = html;	
	}
	
	public String getClassname() {
		return classname;
	}
	
	public void setClassname(String classname) {
		this.classname = classname;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getKor_Score() {
		return kor_Score;
	}
	
	public void setKor_Score(int kor_Score) {
		this.kor_Score = kor_Score;
	}
	
	public int getMath_Score() {
		return math_Score;
	}
	public void setMath_Score(int math_Score) {
		this.math_Score = math_Score;
	}
	
	public int getJava_Score() {
		return java_Score;
	}
	
	public void setJava_Score(int java_Score) {
		this.java_Score = java_Score;
	}
	
	public int getSql() {
		return sql;
	}
	
	public void setSql(int sql) {
		this.sql = sql;
	}
	
	public int getHtml() {
		return html;
	}
	
	public void setHtml(int html) {
		this.html = html;
	}
	
	@Override
	public String toString() {
	    return String.format("[%s] 이름: %s 성별:*%s* 국어점수: %d, 수학점수: %d Java점수는: %d 입니다, sql점수는: %d 입니다 ,Java 점수는:%d 입니다" , 
	                         classname, name, gender, kor_Score, math_Score, java_Score, sql, html);
	}
}