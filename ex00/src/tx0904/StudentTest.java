package tx0904;

import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args) {
		/*
		 * ArrayList(사용) 평균 점수 60이상 과목점수 40점 이상 넘으면 pass 아니면 fail
		 */
		ArrayList<Student> stdlist = new ArrayList<>();
		ArrayList<Teacher> tdlist = new ArrayList<>();
		School sc = new School();
		// 학생의 인스턴스 생성
		Student std = new Student("A반", "JEN", "M", 80, 100, 100, 50, 50);
		Student std1 = new Student("B반", "KA", "W", 40, 50, 70, 20, 0);
		Student std2 = new Student("C반", "LEMOM", "M", 50, 60, 20, 10, 10);
		Student std3 = new Student("A반", "SKA", "W", 10, 30, 50, 10, 10);
		// Student std4 = new Student("A반", "SKA", "W", 10, 30, 50, 10, 10);

		stdlist.add(std);
		stdlist.add(std1);
		stdlist.add(std2);
		stdlist.add(std3);
		// stdlist.add(std4);
		// 선생 인스턴스 생성
		Teacher tch1 = new Teacher("제인", 2, "java", "A");
		Teacher tch2 = new Teacher("니퍼", 1, "sql", "B");
		Teacher tch3 = new Teacher("패스", 1, "sql", "C");
		tdlist.add(tch1);
		tdlist.add(tch2);
		tdlist.add(tch3);

		// 선생님의 정보 출력
		for (int j = 0; j < tdlist.size(); j++) {
			Teacher t = tdlist.get(j);
			System.out.println(t);
		}

		// 학생 정보 출력
		int maleCnt = 0;
		int femaleCnt = 0;
		int AclassCnt = 0;
		int BclassCnt = 0;
		int CclassCnt = 0;
		for (int i = 0; i < stdlist.size(); i++) {
			Student s = stdlist.get(i);
			System.out.println(s);
			// 남자인지 여자인지 문자열 구분 및 비율
			if (s.getGender().equals("M")) {
				maleCnt++;
			} else {
				femaleCnt++;
			}
			if (s.getClassname().equals("A")) {
				AclassCnt++;
			}else if (s.getClassname().equals("B"))
				BclassCnt++;
			}
	
		// 학생정보를 비교해서 A,B,C반 비율 구하기

		// 비율 계산
		double maleratio = (double) maleCnt / (stdlist.size()) * 100.0;
		double femaleratio = (double) femaleCnt / (stdlist.size()) * 100.0;
	
		
		// 이거 한줄이야? 클래스이름.변수명(선언) 이거때문에 30분 날아갔다~~~~~~~~~~~~~~~~~
		Management.ManagementState(stdlist);

		// 객채생성

		System.out.println("====================");
		// 아 그대로!! 또 30분 낭비했내 아오
		sc.setTotalCnt(stdlist.size());
		sc.setmentotalCnt(maleCnt);
		sc.setwomentotalCnt(femaleCnt);
		System.out.println(sc);

		// 남녀비울
		sc.setmentotalCnt(maleCnt);
		System.out.println("남자 :" + maleratio + "%, 여자" + femaleratio + "%");
	
		
	}

}
