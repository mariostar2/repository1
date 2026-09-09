
package tx0902;

import java.util.Scanner;

public class resultSetTest {

	/*
	 * 예외처리 ArithmeticException: 연산 처리 에외
	 */
	public static void main(String[] args) {
		// zero 예외처리
		try {
			int result = 10 / 0;
			System.out.println(result);
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			Scanner sc = new Scanner(System.in);
			// ArrayIndex 예외처리
			try {
				int[] arr = { 1, 2, 3, 4 };
				arr[5] = 110;
			} catch (ArrayIndexOutOfBoundsException ie) {
				System.out.println("에러");
				// nullPointer
				try {
					String s = new String();
					s = null;
					System.out.println(s);
				} catch (NullPointerException ne) {
					System.out.println("예외 처리 되었습니다");
				}
				// 예외처리를 마지막에 이친구로 하면 전부 처리한다
				try {
					int input = sc.nextInt(1);		
				} catch (Exception e) {
					System.out.println("오류 잡아냄");
				}
				System.out.println("프로그램 종료합니다");
			}
		}
	}
}