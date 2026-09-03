package tx0827;

import java.util.Random;

public class Test1 {

	//중복 방지
	public static void main(String[] args) {
		Random rd = new Random();
		
		//new  int [6] <- 난 배열을 만들거야 6개의 공간을 가진 배열을 array라는 변수명으로 지정해서 그리고 그게 int[] 배열이라는 공간에 대입할거야
 		int[] array = new int[6];
		int rdNum =  rd.nextInt(6)+1;
		//변수 선언
		boolean flag = true;
		
		for(int i=0; i<array.length; i++) {
			//배열 0번에 0번 인덱스를 비교
			if(array[0] == array[0]) {
				array[0] = rdNum;
				
			}
			//첫번째 인덱스에서 비교
			for(int j =0; j<1; j++) {
			
			
			}
			
			
			//배열의 덧샘
			int[] array2 = {1,2};
			for(i=0; i<array2.length; ) {
				System.out.println(array2);
				break;
			}
			
		}
	}

}
