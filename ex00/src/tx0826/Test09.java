package tx0826;

public class Test09 {



	public static void main(String[] args) {
		//임의의 배열을 만들고 똑같은 숫자가 들어가있는가 확인 
		//메인함수는 배열만 가지고 있고 그 배열을 다른 함수한태 넘겨주면서 같은 숫자가 있는지 확인 
		//같은수가 있으면 있다 없으면 없다..
		//중복된수가 없다 1 or 0이냐 아니면 뭐 불린으로 하든 프리 
		
		int n =10;
		if( n!=10) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}

		int age = 19;
		if(age>19) {
			System.out.println("입장 가능");
		}else {
			System.out.println("입장 불가");
		}
		
		int score = 59;
		if(score >60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		//점수가 80점 이상이면 우수 60점 이상이면 보통 40점 미만이면 심각
		int score2 = 80;
		if(score2 >=80) {
			System.out.println("우수");
		}else if(score2 > 60) {
			System.out.println("보통");
		}else if(score2 >40) {
			System.out.println("심각");
		}else {
			System.out.println("불합격");
		}
		
		
		
	
	}
	

}
