package tx0826;

import java.util.Random;

public class Text07 {

	public static void main(String[] args) {
		int[] arr = new int[4];
		arr[3] = 10;
		// arr[4] =100;
		// out of bounds for length(배열 길이 초과)
		// System.out.println(arr[4]);

		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			// array[i] =(i+1) 더해라 10번다할때까지
			array[i] = (i + 1);
			System.out.println(array[i]);
		}

		System.out.println(array.length);

		System.out.println("---------------------");
		int[] arr2 = new int[10];
		// 배열 역순
		for (int i = arr2.length - 1; i >= 0; i--) {
			arr2[i] = (i + 1);
			System.out.println(arr2[i]);
		}
		System.out.println("----------------------");

		int[] arr3 = new int[20];
		for (int i = arr3.length - 1; i >= 0; i--) {
			arr3[i] = (i + 1);
			System.out.println(arr3[i]);
		}
		System.out.println("---------------------");

		int n = Integer.MAX_VALUE;
		System.out.println(n);

		int k = 2147483647 + 1;
		System.out.println(k);

		// 로또 번호 추출기
		// 중복 방지
		// 비교 == if else
		// 중복 검증
		// 저장
		// 출력
		// 중복발생시 x
		// 저장 무언가에
		// 출력
		// 2. 랜덤함수를 사용
		// Math.ramdom 함수는 특정 양수를 곱하면 곱한값에 -1로 한 최대값이 나온다. 즉 1을 대입시에 0~44 가나온다
		// 정확히는44.9999... -> 올림해줘야해서 +1
		// 3 두수를 비교 (==)
		// lotto라고 하는 배열을 만든다
		
		
		// 1. 번복를 뽑을 갯수 는 6개다
		//반복제어변수를 두자
		Random rd = new Random();
		int[] lotto = new int[6];
		int rNum = (int) (Math.random() * 6) + 1;
		lotto[0] = rNum;
		boolean flag = true;
		
	 
		
			
	}
}
