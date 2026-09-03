package tx0825;

public class Test04 {

	public static void main(String[] args) {
		//재귀함수
		//5 >0 -> 5(참)
		// n-1 -> 4(참)
		//4 >0  ..... 1-1 = 0;
		
	}
	void f(int n) {
		System.out.println(n);
		if(n >0) {
			f(n-1);
			System.out.println(n);
		}
		
	}

}
