package tx0827;

public class CscoreManager {

	// 총점구하기
	
	
	//학생정보를 하나 받아와서 총점을 구함
	public int new_caltTotal(Student std) {
		int total = std.kor_score +std.eng_score +std.math_score;
		return total;
		
	}
	//학생정보를 하나 받아와서 평균을 구함
	public int new_toavg(int tostal) {
		int avg1 = tostal/3;
		return avg1;
	}
	
	
	//학생정보 + 점수정보
	//1. 자료형 2. 함수이름 3.변수선언(인스턴스)
	public int tostal(int kor_scores, int eng_scores, int math_scores) {
		// 4. 함수가 할일
		int total = kor_scores + eng_scores + math_scores;
		// 5.돌려주는 리턴문
		return total;
	}
	
	// 평균 구하기 함수
	public int toavg(int kor_scores, int eng_scores, int math_scores) {
		int avg = kor_scores + eng_scores + math_scores / 3;
		return avg;
	}
	
}


