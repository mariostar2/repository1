package tx0825;

public class Test {

	public static void main(String[] args) {
		/*
		 *변수 사용전 반드시 선언부터 한다!
		  변수 이름은 본인이 알아서 정한다.
		  변수 선언 방법: 자료에 저장할때 형태를 명시한다
		  모든 명령문 끝에는 반드시 세미클론; 
		  ** 정수 1개를 저장할 변수 선언하기
		 */
		
		int x = 1;
		int n;

		
		int time = 13;
		
		n = 10;
		System.out.println(n);
		
		char c = 'A';
		System.out.println(c);
		
		double d = 3.14;
		System.out.println(d);
		
		boolean tf = true;
		System.out.println(tf);

		
		while(tf ) {
			//어떤 정수가 1씩 증가한다
			x = x+1;
			//만약 어떤 정수 x가 5보다 크면
			if(x >5) {
				//종료
				tf = false;
			}
			//어떤 정수(x)가 5보다 커지면 종료
			
		}
		//어떤 정수가 1부터 1개씩 찾는데 반복 하는 과정에서 처음에 1부터 2 ~3 정수가 5보다 커지면 1씩 커지 반복문 종료(1씩증가)
	
		//조건문
		//만약에 ~라면  해석이 되는 경우
		//조건문을 사용한다.
		//예) 성별이 'M' 이면 남성 F면 여성
		//조건 이란 '참' , '거짓'으로 판별 가능 한것 
		// 예시) 10이 3보다 크다? : 참 -2 >10 : 거짓 
		
		//time이라는 변수에 12보다 작으면 if문이 실행된다
		
		//무조건 학습
		//aa라는 변수가 5보다 작으면 5보다 작아요라고 출력 
		//아니면 A는 5와 같거나 5보다 큽니다라고 출력한다
		int aa =4;
		if(aa <=5) {
			System.out.println("5보다 작아요");
		}else {
			System.out.println("5와 같거나 5보다 큽니다");
		}
		
//		int score = 93;
//		
//		if(score >= 90) {
//			System.out.println("A학점");
//		}else if(score >= 80) {
//			System.out.println("B학점");
//		}else if(score >= 70) {
//			System.out.println("C학점");
//		}else {
//			System.out.println("F학점");
//		}
		//조건문
		
		
		
//		if(time < 12) {
//			System.out.println("종료");
//		}else {
//			System.out.println("거짓");
//		}
		//명령문 - 위의 조건식의 결과가 '참인경우 실행'
			
		//90점 이상 이면 A 80 B
		//밑 거짓일 경우 실행
		
		//성적처리 //
		int score1 = 90;
	
		switch(score1/10) {
		case 9:
			System.out.println("A학점입니다");
			break;
		case 8 :
			System.out.println("B학점입니다");
			break;
		case 7: 				
			System.out.println("C학점입니다");
			break;
		case 6:
			System.out.println("D학점입니다");
			break;
		case 5:
			System.out.println("F학점입니다");
			break;
		}
		
		
		int score2 = 1;
		String a = switch (score2) {
		case 1,2,3 -> "수";
		case 4,5,6 ->"우";
		default ->"알수없음";
		};
		System.out.println(a);
		
		int le3 = 10;
		String b = switch(le3) {
		case 1,2,3->"1";
		case 4,5 ->"2";
		case 6 ->"3";
		default ->"x";
		};
		System.out.println(b);
		
	}
}
