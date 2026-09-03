package tx0825;

public class test_file {

	public static void main(String[] args) {
		
		//반복문(while) -반복의 횟수
		//반복 횟수를 기억하려면 어떻게 할까~~
		//반복횟수를 저장할 변수를 선언
		int cnt =0 ;
		int x;
		int i;
		int y;
		while(cnt <=5) {
			//cnt 초기값은 0이고 
			//1씩증가
			System.out.println(cnt);
			cnt = cnt +1;
		}
		
		//for문
		for( i =0; i<1; i++) {
			for(x =0; x<3; x++) {
				System.out.println("^");
			}
			System.out.println("*");
		}
		
		//어떤변수에 반복문을 출력할건데 출력결과가 처음에는 100 두번쨰는 102 그다음은 104 106.....110 나오면 종료
		//102 104 106 108 110
		
		int y1 = 100;

		while (y1 <= 110) {
		    System.out.println(y1);
		    y1 += 2; 
		}
		for(y=100; y<=110; y++) {
			if(y %2==0)
			System.out.println(y);
		}
		
		
	}

}
