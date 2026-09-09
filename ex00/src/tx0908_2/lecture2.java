package tx0908_2;

public class lecture2 {
	public static void main(String[] args) {
		int [] a = {1,2,4,5,6,7};
		int add1 = 0;
		int add2 = 0;
		
		for(int i =0; i<a.length; i++) {
			if(a[i] % 2==1) {
				add1++;
			}else if(a[i] % 2 ==0) {
				add2++;
			}
			else {
				break;
			}
		}	
		
		System.out.println("홀수의 갯수" + add1);
		System.out.println("짝수의 갯수" + add2);
		int []odds = new int[add1];
		int	[]adds = new int[add2];
		int n =0;
		int m =0;
		for(int i=0; i<a.length; i++ ) {
			System.out.println(a[i]);
			if(a[i] % 2==0) {
				adds[n] = a[i];
				n = n+1;
			}else {
				odds[m] = a[i];
				m = m+1;
			}
			System.out.println("===============================");
			for(int j=0; j<odds.length; j++) {
				System.out.println(odds[j]);
			}
			System.out.println("=================================");
			for(int p=0; p<adds.length; p++) {
				System.out.println(adds[p]);
			}
		}
	}	
		
		
}
