package tx0825;

public class Test01 {

	
	public static void main(String[] args) { 	
	
		
		/*
		 *함수 호출문과 정의문의 이해
		 */
		f1();
		//메인함수가 f2 함수를 호출해서 식별하는 코드를 입력하시오
	
		//f3함수가 실행할건데 main함수가 f1함수를 호출하면 f1함수는 f2함수를 호출하고
	}// main 끝
	static void f() {
		System.out.println("f함수 호출");
	}
	static void f1() {
		System.out.println("f1 함수 호출");
	
		//호출문
		f2();
	}
	
	static void f2() {
		System.out.println("f2 함수 호출");
		
		
	}
	
	
	
	
	
}
	





