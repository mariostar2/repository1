package tx0826;


//(x) 틀린문제
//(^) 해결완료
//(O) 맞춘문제
public class Test06 {

	public static void main(String[] args) {
		
		//1. 정수형 변수를 선언하고 2를 대입하시오
		int  r =2;
		int result = r;
		System.out.println(result);
	
		
		//2. 실수형 변수를 선언하고 3.14를 대입하시오
		float result1= 3.14f;
		System.out.println(result1);
		
		
		//3. 문자열 변수를 선언하고 "홍길동"이라고 대입하시오
		String name = "홍길동";
		System.out.println(name);
	
		
		//4. 정수형 변수 a,와 b를 각각 출력하시오 
		int a;
		int b;
		a= 10;
		b =20;
		System.out.print( "a"+"="+ a);
		System.out.print("b"+"=" +b);
	
		//5. a와 b룰 합한 값을 출력하시오
		int sum;
		sum=a +b;
		System.out.println("c" + "=" + sum);
	
		
		// 6. 정수형 변수 score를 선언하고  80을 대입한뒤에 score가 60이상이면 "합격을 출력하시오"
		int score;
		score = 80;
		if(score > 60) {
			System.out.println("합격");
			
		//7. 60이상이면 합격 그렇지 않으면 불합격을 출력하시오
		}else {
			System.out.println("불합격");
		}
		//8. num이 짝수인지 홀수 인지 판별
		int num =3;
		if(num %2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		System.out.println("--------------------------------");
		//9. 3개의 정수 중 가장 큰 값을 찾아 출력하시오(x) ---->(^)
		//3개의 수를 비교해서 큰 수 반환(비교)
		//Math.max()두번 중첩
		int a1 = 20,b1 = 25,c1 =20;
		int max = Math.max(a1, Math.max(b1, c1));
		System.out.println(max);
		
		//10. 1부터 10까지 정수를 순서대로 출력하는 for문을 작성하시오
		for(int i =1; i<11; i++) {
			System.out.println(i);
		}
		//11. 1부터 100까지 정수의 합을 구하여 출력하시오(x) ---> (^)
		int sum1 =0;//(x)
		for(int i=1; i<101; i++) {
			sum1 += i;//(x)
		}
		System.out.println("1부터 100까지의 총합은 :" + sum1 +"입니다");
		//12. while 문을 사용하여 5부터 1까지 거꾸로 출력(x)
		//반대로 출력 어려워함
		int n = 0;
		while(n <6) {
			System.out.println(n);
			n = n +1;
		}
		
		//13. 1부터 20까지 정수 중 짝수만 출력
		for(int i=1; i<21; i++) {
			if(i %2 ==0) {
				System.out.println(i);
			}
		}
		//14.구구단 3단 출력
		for(int i=3; i<4; i++) {
			System.out.println("3단");
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+ j+ "=" +i*j);	
			}
		}
		//15.두 정수를 매개변수로 받아 그 합을 반환하는 add 매서드를 작성하시오
		
		//16. 정수 하나를 매개변수로 받아 짝수인지 홀수 인지 판별해 문자열 checkEven 매서드를 작성하시오
		
		//17. 매개변수 없이 "안녕하세요"를 출력하는 sayHello 매서드를 작성하시오
		
		//18. 정수 n을 받아 1부터 n까지의 합을 반환하는 sumTo 매서드를 작성하시오
		
		//19.
		
		//20.
		
	
		
		
	}

}
