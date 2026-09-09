package tx0907;

import java.util.HashMap;
import java.util.Scanner;

public class disc2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String>dict = new HashMap<>();
		//문자열 키와 value값을 등록
		dict.put("사과", "apple");
		dict.put("칼", "knife");
		dict.put("램프", "lamp");
		dict.put("아아", "aaaa");
		
		System.out.println("단어를 등록 하시겠습니까? 1.네? 2. 아니오");
		//키보드 값을 넘겨줄 스캐너 변수등록
		int choise = sc.nextInt();
		sc.nextLine();
		if(choise ==1) {
			System.out.println("추가할 단어를 입력해주세요");
			//추가할 단어를 다음 라인으로 보내줄 변수 
			String nextPlus = sc.nextLine();
			System.out.println("그 뜻을 영어로 입력해주세요");
			String newValue = sc.nextLine();
			//단어를 넣어준다
			dict.put(nextPlus, newValue);
			System.out.println("["+nextPlus+"] 가 등록되었습니다");
		}else {
			sc.close();
			System.exit(0);
		}
		//점수게임
		int score =0;
		System.out.println("50점을 달성하시면 게임이 종료됩니다.");
		while(score <50) {
			System.out.println("게임을 종료하겠습니다");
			//해시맵에 있는 단어를 꺼내라 
			for(String quizMap : dict.keySet()) {
				//단어를 꺼내면 
				System.out.println("["+quizMap+"]의 영어 스팰링이 무엇인가요?");
				System.out.println("정답을 입력해주세요:");
				//유저가 입력하고 띄어쓰기 해서 넘긴다
				String userEnter = sc.nextLine();
				String userAnswer =dict.get(quizMap);
				if(userEnter.equalsIgnoreCase(userAnswer)) {
					score +=10;
					System.out.println("정답을 맞추셨습니다 +10점을 획득 하셨습니다" + score + "점을 달성하셨습니s다 ");
				}else {
					System.out.println("정답을 맞추지 못했습니다 0점을  획득하셨습니다 정답은["+userAnswer+"]입니다  총 점수가" + score+"점을 획득하였습니다");
				}if(score>=50) {
					System.out.println("게임을 종료하겠습니다");
					break;
				}
			}
		}
	}
}
