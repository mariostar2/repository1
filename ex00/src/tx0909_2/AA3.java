package tx0909_2;


import java.util.HashMap;
import java.util.Scanner;



public class AA3 {
	/*
	 * // 1번 메뉴를 선택하면 토르가 출동 2번 메뉴를 선택하면 헐크가 출동 3번 메뉴를 선택하면 캡틴 아메리카가 출동 4번 메뉴를 누르면
	 * 전채 출동 이걸 Map으로 구현.....................................
	 * 
	 * 각각 출동하면 주특기 사용
	 */
	
	
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hash2 = new HashMap<>();
		hash2.put(1,"토르" );
		hash2.put(2,"헐크" );
		hash2.put(3,"캡틴 아메리카");
		hash2.put(4,"전체" );
		
		String userSelect = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 선택해주세요 ");
		System.out.println("1. 토르 2. 헐크 3. 캡틴아메리카 4. 전채");
		
		String userSe= sc.nextLine();
		if(userSe.equals("1")) {
			System.out.println("토르가 출동하겠습니다");
		}
		if(userSe.equals("2")) {
		
			System.out.println("헐크가 출동하겠습니다");
		}
		if(userSe.equals("3")) {
	
			System.out.println("캡틴아메리카가 출동하겠습니다");
		}
		if(userSe.equals("4")) {

			System.out.println("전체 출동");
		}
		
	
	}
	
	
	
	
}
