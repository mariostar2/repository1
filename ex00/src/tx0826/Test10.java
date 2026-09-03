package tx0826;

public class Test10 {

	public static void main(String[] args) {
		int i = 1; // 1단부터 시작하도록 초기화 (이 부분이 빠졌거나 값이 3 이상일 확률이 높습니다)

		while(i <= 3) {
		    int j = 1;
		    while(j <= 9) {
		        System.out.println(i + "*" + j + "=" + (i * j));
		        j++;
		    }
		    System.out.println();
		    i++;
		}
		

	}

}
