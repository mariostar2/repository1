package tx0828;

import java.util.Scanner;

//Scanner sc = new Scanner(System.in);
//System.out.println("4글자만 입력하세요 >>");
////문자열 입력
//String input_str = sc.nextLine();
//System.out.println(input_str.length());
//
//if(input_str.length() > 4) {
//	System.out.println("글자가 많다");
//}else {
//	System.out.println("글자가 적다");
//}

public class StringTest {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.length());

		System.out.println("str.length()" + str.length());

		System.out.println("str.charAt()" + str.charAt(0));
		System.out.println("str.charAt()" + str.charAt(1));
		System.out.println("str.charAt()" + str.charAt(2));
		// 알파벳 o가 Hello라고 하는 문자열 안에 몇번째 위치에 있나
		System.out.println(str.charAt(0) == 'o');
		System.out.println(str.charAt(1) == 'o');
		System.out.println(str.charAt(2) == 'o');
		System.out.println(str.charAt(3) == 'o');
		System.out.println(str.charAt(4) == 'o');

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'o') {
				// char를 반환하니까 선언해서 변수만들고 출력
				int i2 = i;
				System.out.println(i2);
			} else {
			}
		}
		System.out.println("----------------------------------------------------------");

		str = "Java Programming";
		boolean tf = str.contains("Javacs");
		System.out.println(tf);

		tf = str.startsWith("Ja");
		System.out.println(tf);

		tf = str.endsWith("ing");
		System.out.println(tf);
		/*
		 * [Java aaa.txt] [Java bbb.txt] [Java ccc.pdf] [aaa.c] [bbb.c] [ccc.txt]
		 */

		// 확장자가 txt인 파일이 몇개인지 출력하는 프로그램을 작성하시오.

//		String br = "aaa.txt";
//		String br1 = "bbb.txt";
//		String br2 = "ccc.pdf";
//		String br3 = "aaa.c";
//		String br4 = "bbb.c";
//		String br5 = "ccc.txt";

		// 배열로 묶어서 -> 반복문으로 찾아내고 if문으로 맞나 아닌가 출력하면 끝(연습 및 이해 필요)
		// endwidth
//		String[] brb = { br, br1, br2, br3, br4, br5 };
//		int count = 0;
//		for (int i = 0; i < brb.length; i++) {
//			if (brb[i].endsWith("txt"))
//				;
//			System.out.println(brb[i]);
//		}

		// txt 파일을 찾으시오
//		boolean ar = br.contains("txt");
//		System.out.println(br); 
//			if(br.startsWith("txt")) {		
//				System.out.println(ar);
//			}else {
//			}

		// 앞뒤가 바뀌어서 출력됨
		// replace :글을 바꿔서 출력
		str = "자바는 너무 어려워.";
		String new_str = str.replace("어려워", "쉬워");
		System.out.println(new_str);

		str = "Java,Python,C++";
		String[] ss = str.split(str);

		// 향상된 for문 클론은 오른자료에는 묶음 자료가 왼쪽에는 묶음 자료안에 있는 변수를 선언
		// 이 for문은 처음부터 끝까지 순차적으로
		for (String s : ss) {
			System.out.println(s);
		}
		// 밑에 for문이랑 비슷하다
		for (int i = 0; i < ss.length; i++) {
			String s = ss[i];
			System.out.println(s);
		}
		/*
		 * substring : 지정한 인덱스의 번호만 출력
		 */
		str = "0123456789";
		System.out.println(str.substring(2));//23456789
		System.out.println(str.substring(6));//6789
		// 2는 포함 6은 제외
		System.out.println(str.substring(2, 6));//2345
		System.out.println(str.substring(6, 9));//678

		/*
		 * toUpperCase: 대문자로 변환 
		 * toLowerCase: 소문자로 변환
		 */
		str = "AbcDefGhi";
		System.out.println(str.toUpperCase());//ABCDEFGHI
		System.out.println(str.toLowerCase());//abcdefghi
		/*
		 * length: 길이 trim: 공백을 없앰
		 */
		str = "Hello Java   ";
		System.out.println(str);
		System.out.println(str.trim());
		System.out.println(str.length());
		System.out.println(str.trim().length());
		/*
		 * equals:  데이터 값이 서로 일치하는지 조회해보고 출력 
		 */
		String pw = "1234";
		String pw2 = "1234";
		System.out.println(pw.equals(pw2));
		String a ="Hello";
		String b = "Java";
		/*
		 * concat :문자열을 이어붙일때 사용함
		 */
		System.out.println(a.concat("").concat(b));
		System.out.println(a+ "" +b);
		/*
		 * isEmpty: 공백을 문자로 취급하는가 안하는가
		 */
		String c =" ";
		System.out.println(c.isEmpty()); //false
		String d ="";
		System.out.println(d.isEmpty());//true
		/*
		 * isBlank: 아무것도 안넣어도 문제 넣어도 문제
		 */
		System.out.println(c.isBlank()); //true
		System.out.println(d.isBlank()); //true
		/*
		 * compareTo:사전적으로 조회해서 어떤것이 앞에 있냐 뒤에 있냐  -1:뒤에 있다 0:같다 1:앞에 있다.
		 * 뒤에 있는 문자열보다도 글자의 차이까지 알려줌 
		 */
		System.out.println("apple".compareTo("banana")); //-1 사전적으로 앞에 있음
		System.out.println("banana".compareTo("apple"));// 1 같은위치
		System.out.println("apple".compareTo("apple"));//0 사전적으로뒤에 있음
		/*
		 * parseInt: 숫자로 바꿔서 출력하는것(형변환)
		 * parseDouble: 실수형으로 바꿔서 출력해주는것(형변환)
		 */
		str = "123";
		int n = Integer.parseInt(str);
		System.out.println(n);
		
		str = "123.12";
		double dn = Double.parseDouble(str);
		System.out.println(dn);
		/*
		 * valueOf: true false 구분 
		 */
		str = "123";
		int m = 123;
		String x =String.valueOf(m);
		System.out.println(x.equals(str));
		
		String name = "홍길동";
		int age =25;
		
		String result ="이름: %s, 나이: %d".formatted(name,age);
		System.out.println(result);
		
		result = String.format("이름: %s, 나이: %d",name,age);
		System.out.println(result);
		
		/*
		 * indexOf():괄호 안에 명령어를 입력하면 인덱스 몇번에 있는지 찾는 함수
		 * Hello java라는 문자열에서 Java는 몇번째에 발견되는가?
		 */
		str = "Hello Java";
		System.out.println(str.indexOf("Java"));
		
		str = "Java is easy. Java is fun."; 
		System.out.println(str.indexOf("."));
		System.out.println(str.lastIndexOf("."));
		
		String k = "[Java]aaa.txt";
		//문자열 txt만 출력하세요. lastIndexOf(), subString사용
		System.out.println(k.lastIndexOf("."));
		System.out.println(k.substring(10,13));
		System.out.println(k.substring(6,9));
		
		System.out.println("apple".compareTo("apple"));
	}
	
}
