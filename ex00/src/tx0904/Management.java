package tx0904;

import java.util.ArrayList;

public class Management {

	//학생의 총점 평균 출력
	public static void ManagementState(ArrayList<Student> stdlist) {
		for (int i = 0; i < stdlist.size(); i++) {
			Student s = stdlist.get(i);
			int total = s.getKor_Score() + s.getMath_Score() + s.getJava_Score() + s.getSql() + s.getHtml();
			System.out.println("학생의 총점은 : " + total);
			
			int avg = total / 5;
			System.out.println("학생의 평균 : " + avg);
			
			if (avg >= 60) {
				System.out.println("pass");
			} else {
				System.out.println("fail");
			}
		}
		
	}	
	
	//학생정보 
	public static void CreateManagementState(ArrayList<Student>stdList) {
		
	}
	
	//선택한 학생의 클래스의 평균을 출력 
	public static void UpdateManagementState(ArrayList<Student>stdList) {
		
	}
}
