package tx0825;

import java.util.Scanner;


//클래스로 선언
class Cal{
	int ad(int a , int b){
		return a+b;
	}
	int mi(int a, int b) {
		return a-b;
	}
	int ki(int a, int b ) {
		return a*b;
	}
	 int ps(int a ,int b) {
		 return a/b;
	}
}
public class Test02 {
	/*
	 * 함수가 호출 될 때두개의 정수를 받아서 두개의 합한 결과를 돌려주는 함수
	 * 메인함수에서 결과를 호출해서 출력하시오 
	 * 계산기 사칙연산
	 * Scanner 함수를 사용해서 키보드가 입력받으면 출력값이 나오도록 정함
	 * 1. num( 1번 숫자) , num1 (2번숫자) 연산자(res)  결과값(result)
	 */
	public static void main(String[] args) {
		//키보드 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 값을 입력해주세요:");
		int num =sc.nextInt();
		
		System.out.println("두번째 값을 입력해주세요:");
		int num1 =sc.nextInt();//여기서 부터 계산
		
		//초기값을 주지 않더라도 res를 안줘도된다 
		System.out.println("원하는 연산자를 입력(1.+,2- 3,*,4/)");
		int res = sc.nextInt();
		
		Cal cl = new Cal(); //클래스로 정의하면 선언 안되나?	
		
		//결과값은 그냥 0으로 선언
		int result = 0;
		if(res ==1) {
			result = cl.ad(num ,num1);
			System.out.println(result);
		}else if(res ==2) {
			result = cl.mi(num,num1);
			System.out.println(result);
		}else if(res ==3) {
			result= cl.ki(num,num1);
			System.out.println(result);
		}else if(res ==4) {
			result = cl.ps(num,num1);
			System.out.println(result);
		}else {
			System.out.println("문제발생!");
		}
		//아! if else
		sc.close();
		
	}

}


		

	
