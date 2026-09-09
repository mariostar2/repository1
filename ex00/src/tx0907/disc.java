package tx0907;

import java.util.HashMap;
import java.util.Scanner;

public class disc {

	// 한영사전
	// 단어등록하기
	// 키:사과.
	// 메뉴 선택시 문제풀기
	// 맞츠면 10점 틀리면 0점
	// 50점
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		map.put("사과", "apple");
		map.put("배", "pear");
		map.put("귤", "mandarin");
		System.out.println("단어를 등록하시겠습니까? 1.네? 2.아니오?");
		int choise = sc.nextInt();
		sc.nextLine();
		if (choise == 1) {
			System.out.println("추가할 단어를 입력해주세요.");
			String newPlus = sc.nextLine();
			System.out.println("그 뜻을 영어로 입력하시오");
			String newValue = sc.nextLine();
			map.put(newPlus, newValue);
			System.out.println("[" + newPlus + "] 가 등록되었습니다");
		} else {
			sc.close();
		}

		int score = 0;
		System.out.println("50 점을 달성하시면 게임이 끝납니다");
		while (score < 50) {
			
			for (String quizKey : map.keySet()) {
				System.out.println(" [" + quizKey + "]의 영어 스펠링은 무엇일까요?");
				System.out.print("정답 입력: ");
				String userAnswer = sc.nextLine();
				String correctAnswer = map.get(quizKey);
				if (userAnswer.equalsIgnoreCase(correctAnswer)) {
					score += 10;
					System.out.println("⭕ 정답입니다! (+10점) 현재 점수: " + score + "점");
				} else {
					System.out.println("❌ 틀렸습니다! (0점) 정답은 [" + correctAnswer + "]입니다. 현재 점수: " + score + "점");
				}
				if (score >= 50) {
					System.out.println("게임을 종료하니다");
					break;
				}
			}
		}
	}

}
