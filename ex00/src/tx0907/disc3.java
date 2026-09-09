package tx0907;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class disc3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> dict = new HashMap<>();
		dict.put("칼", "knife");
		dict.put("총", "gun");
		dict.put("대륙간 탄도미사일", "ICBM");
		dict.put("잠수함 발사 탄도 미사일", "SLBM");

		Set<String> dict2 = new HashSet<>();
		dict2 = dict.keySet();
		ArrayList<String> values = new ArrayList<>();
		for (String value : dict2) {
			values.add(value);
		}

		int score = 0;
		while(true) {
			Random rd = new Random();
			int rdIdx = rd.nextInt(values.size());

			String korean = values.get(rdIdx);     
			String english = dict.get(korean);    
			System.out.println(korean + "를 영어로 ?");
			String answer = sc.next();
			
			
			if (english.equalsIgnoreCase(answer)) {
				System.out.println("정답!");
				score += 10;
				System.out.println("현재 점수: " + score + "점\n");
			} else {
				System.out.println("오답! 정답은 " + english + " 입니다.\n");
			}
			
			if (score >= 50) {
				System.out.println("50점 달성 완료 프로그램을 종료합니다.");
				break;
			}
		}
		sc.close();
	}
}