package res1;

public class res1 {

	public static void main(String[] args) {

		// 반복문 (for)
		int i;
		int score = 90;
		for (i = 1; i < 10; i++) {
			System.out.println(i);
		}

		// 구구단 출력
		for (int i1 = 1; i1 < 10; i1++) {
			for (int j1 = 1; j1 < 10; j1++) {
				System.out.println(i1 + "*" + j1 + "=" + i1 * j1 +"\t");
			}
			System.out.println("");
		}
		// while 문
		while (score > 80) {
			System.out.println("합격");
			break;
		}
		
		// 조건문
		// if -else문
		if (score > 90) {
			System.out.println("A학점입니다");
		} else if (score > 80) {
			System.out.println("B학점입니다");
		} else if (score > 70) {
			System.out.println("C학점입니다");
		} else if (score > 60) {
			System.out.println("D학점입니다");
		} else {
			System.out.println("그 이외");
		}
		
		// switch문
		switch (score / 10) {
		case 9:
			System.out.println("A학점입니다");
			break;
		case 8:
			System.out.println("B학점입니다");
			break;
		case 7:
			System.out.println("C학점입니다");
			break;
		case 6:
			System.out.println("D학점입니다");
			break;
		}

		// 항상된 switch
		int score2 = 4;
		String a = switch (score2) {
		case 1, 2, 3 -> "1";
		case 4, 5, 6 -> "2";
		default -> "x";
		};
		System.out.println(a);
		
		
		//최소값 출력
		int a1 = 10; int b1 = 20; int c1 = 30;
		int min = Math.min(a1,(Math.min(b1, c1)));
		System.out.println(min);
		
		//최대값 출력
		int max = Math.max(a1,(Math.max(b1, c1)));
		System.out.println(max);
		
		//배열 
		
		//함수
		
		
		
		
	}

}
