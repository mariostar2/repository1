package tx0908_2;

public class lecture3 {
	
	public static void main(String[] args) {
		int[] b = {1,2,3,4,5};
		int add1 = 0;
		int add2 = 0;
		for(int i =0; i<b.length; i++) {
			if(b[i] % 2 ==0) {
				add1++;
			}else if(b[i] % 2==1) {
				add2++;
			}else {
				break;
			}
		}
		System.out.println("짝수의 갯수" + add1);
		System.out.println("홀수의 갯수" + add2);
		
		int[] pa  = new int[add1];
		int[] ba = new int [add2];
		int m =0;
		int n =0;
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
			if(b[i] %2 ==0) {
				pa[m] = b[i]; 
				m = m+1;
			}else {
				ba[n] = b[i];
				n = n+1;
			}
			
			System.out.println("=====================");
			for(int j =0; j<pa.length; j++) {
				System.out.println(pa[j]);
			}
			System.out.println("=====================");
			for(int p=0; p<ba.length; p++) {
				System.out.println(ba[p]);
			}
		}
	}	
	
}
