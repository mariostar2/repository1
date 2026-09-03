package tx0827;

public class TestScoreManager {

	// 실행클래스
	public static void main(String[] args) {
		// 인스턴스 생성
		// 각각의 학생정보를 인스턴스3개 가져옴

		// 이름 따로
		Student std = new Student();
		std.name = "James";
		std.kor_score = 80;
		std.eng_score = 70;
		std.math_score = 90;

		Student std2 = new Student();
		std2.name = "Mark";
		std2.kor_score = 80;
		std2.eng_score = 70;
		std2.math_score = 60;

		Student std3 = new Student();
		std3.name = "Ann";
		std3.kor_score = 70;
		std3.eng_score = 60;
		std3.math_score = 50;

		Student[] stds = new Student[3];

		// 학생정보 3개를 배열로 선언
		stds[0] = std;
		stds[1] = std2;
		stds[2] = std3;

		// 배열로 선언하면 반복문

		// 점수 따로(총합)(평균)
		CscoreManager csm = new CscoreManager();
		int total = csm.tostal(std.kor_score, std.eng_score, std.math_score);
		System.out.println(total);

		int avg = csm.toavg(std.kor_score, std.eng_score, std.math_score);
		System.out.println(avg);

		// 국어, 영어 ,수학 성적을 구하는 프로그램
		// 총점: 국어점수 + 영어점수 + 수학점수
		// 평균 :총점 /과목수
		// 학생: James.Mark,Ann

		// 1. James의 성적 처리하기
//		String name = "James";
//		int kor_score = 90;
//		int eng_score = 80;
//		int math_score = 70;
//		int total = kor_score + eng_score+ math_score;
//		System.out.println("총점:" + total);
//		System.out.println("평균:"+ total/3);
//		
//		//2 Mark 성적 처리하기
//		String name2 = "Mark";
//		kor_score = 90;
//		eng_score = 80;
//		math_score = 70;
//		total = kor_score + eng_score+ math_score;
//		System.out.println("총점:" + total);
//		System.out.println("평균:"+ total/3);

		// 배열로 처리한다하면
//		String[] names = { "James", "Mark", "Ann" };
//		names[0] = "James";
//		names[1] = "Mark";
//		names[2] = "Ann";
//
//		int[] kor_scores = { 90, 80, 70 };
//		int[] eng_scores = { 80, 70, 60 };
//		int[] math_scores = { 70, 60, 50 };
//
//		int[] totals = new int[3];
//		totals[0] = kor_scores[0] + eng_scores[0] + math_scores[0];
//		totals[1] = kor_scores[1] + eng_scores[1] + math_scores[1];
//		totals[2] = kor_scores[2] + eng_scores[2] + math_scores[2];
//
//		// 총합
//		for (int i = 0; i < totals.length; i++) {
//			totals[i] = tostal(kor_scores[i],eng_scores[i],math_scores[i]);
//		}
//		
//		//평균
//		int[] avg = new int[3];
//		for (int i = 0; i < totals.length; i++) {
//			avg[i] = toavg(kor_scores[i],eng_scores[i],math_scores[i]/3);
//		}
//
//		// 제임스의 총점과 평균은 얼마인가
//		for (int i = 0; i < 3; i++) {
//			System.out.println(names[i] + "는\n" + "총점은" + totals[i] + "이며" + "평균은" + avg[i] + "입니다");
//		}
	}
}
