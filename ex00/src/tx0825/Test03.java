package tx0825;

public class Test03 {

	static void linePrint(int cnt, char c, char a) {
		for(int i=0; i<cnt; i++){
			System.out.print("=");
		}
		for(int i=0; i<5; i++) {
			System.out.print("*"); 
		}
		
		for(int i=0; i<5; i++) {
			System.out.print("?");
		}
	}
	public static void main(String[] args) {
		/*
		 * 구분선을 5번 그리는 함수
		 *  void
		 */
		linePrint(5,'*','=');

	}
	

}
