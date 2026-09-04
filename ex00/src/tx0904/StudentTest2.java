package tx0904;

import java.util.ArrayList;

public class StudentTest2 {
	
	public static void calc_sta() {
		//a반 학생수 구하기
		
	}
	public static void main(String[] args) {
		
		ArrayList<Student2>student = new ArrayList<>();
		Student2 s = new Student2("철수",'A', 'M');
		
		s.setKor_score(90);
		s.setJava_score(60);
		s.setMath_score(50);
		
		
		//전체 학생수 구하기
		int total =0;
		int all_total =0;
		for(int i =0; i<s.size(); i++) {
			for(int j=0; j<3; j++) {
				total = total + s.get(i).getKor_score();
			}
		}
	
	}
}
