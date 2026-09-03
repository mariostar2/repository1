package tx0826;

public class Test05{
	public static void main(String[] args) {
		
		/*
		 * Math 함수 사용
		 * max : 최대값
		 * min : 최소값
		 */
		int i=10;
		int j=25;
		int p=20;
		//3가지의 수에서 최대값을 구할때
		int max= Math.max(i,(Math.max(j, p)));
		System.out.println(max);
		//3가지의 수에서 최소값을 구할때
		int min=Math.min(i, (Math.min(j, p)));
		System.out.println(min);
	}
}

	