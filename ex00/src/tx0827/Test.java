package tx0827;

import java.util.Random;
import java.util.Scanner;

public class Test {

	// break
	// 지뢰 찾기 게임
	// 1. 좌표를 계산
	// 2. 키보드의 입력을 특정좌표를 클릭하면 맞다 아니다?
	public static void main(String[] args) {

		// 랜덤으로 숫자를 생성
		Random rd = new Random();
		// 랜덤으로 숫자를 생성한다 1~16
		int rdNum = rd.nextInt(16) + 1;
		// 키보드로 입력받는걸 sc라는 변수로 선언
		Scanner sc = new Scanner(System.in);
		// 사용자에게 입력을 받는다
		System.out.println("사용자 입력:");
	
		sc.nextInt();
		// 랜덤숫자를 생성했으면 행과 열에 대한 2차원 배열을 생성
		int[][] row = new int[3][3];
		// 배열의 크기랑 초기화 
		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < row.length; j++) {
				row[i][j] = (3 * i) + i + j;
				System.out.println(row[i][j]);
				
				
			}
			
		}
		
	}
}
