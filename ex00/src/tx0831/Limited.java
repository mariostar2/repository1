package tx0831;

import java.util.Scanner;

//import java.util.ArrayList;

public class Limited {
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int num = 3;// 정수형 저장값을 5개
		int arr = 3;// 확장(백업) 데이터
		
		int[] numberArr =  new int[num]; 
		
		for(int i=0; i<num; i++) {
			boolean flag = false;
			
			System.out.println("정수 입력 테스트를 시작 하겠습니다("+ (i+1)+"):");
			numberArr[i] = sc.nextInt();
			
			for(int j=0; j< i; j++) {
				if(numberArr[j] == numberArr[i]){
				flag = true;
				break;
				}
			}
			if(flag) {
				System.out.println("중복이 발견됨");
			i--;
			continue;
			}
			if(i == num -2) {
				int old = num;
				num += arr;
				int[] tempArr = new int[num];
				for(int j=0; j<old; j++) {
					tempArr[j] = numberArr[j];
				}
				numberArr = tempArr;
			}
			System.out.println("현재 번호 목록:");
			for(int j=0; j <=i; j++) {
				System.out.println(numberArr[j] + (j ==i ? "" : ","));
			}
			System.out.println();
		}
		sc.close();
	}
}
