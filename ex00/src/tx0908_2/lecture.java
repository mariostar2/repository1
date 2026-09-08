package tx0908_2;


public class lecture {

	public static void main(String[] args) {
		//홀수 학생 짝수학생
	
		int[] a = {13,7,24,6,99,100};
		int add =0;
		int add2 =0;
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 == 1 ) {
				 add++;
			}else if (a[i] % 2 == 0) {
				add2++;
				//짝수 배열 갯
			}else {
				break;
			}
			
		}
		System.out.println("홀수의 갯수:" + add);
		System.out.println("짝수의 갯수:"+ add2);
		
		//홀수 갯수만큼 길이로 홀수 배열 만들기
		//홀수의 배열만큼 순회하면서 ~나오면 
		int[] odds = new int[add];
		int[] evens = new int[add2];
		int n =0;
		int m =0;
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
			if(a[i] % 2 ==0) {
				evens[n] = a[i];
				n =n+1;
			}else {
				odds[m] = a[i];
				m = m+1;
			}
		}
		System.out.println("===================================");
		for(int j =0; j<evens.length; j++) {
			System.out.println(evens[j]);
		}
		System.out.println("===================================");
		for(int p=0; p<odds.length; p++) {
			System.out.println(odds[p]);
		}
		
		
	
	}
}
