package tx0826;

import java.util.Random;

public class Test2 {

	public static void main(String[] args) {
		
		//무작위로 숫자를 찾고 무작위로 숫자를 뽑아서 비교
		Random rd = new Random();
		int[] nums = new int[6];
		//6개의 숫자를 랜덤으로 뽑기 +1 을 한이유눈 index 시작이 0부터 
		int rdN = rd.nextInt(6)+1;
		
		
		for(int i=1; i<nums.length; i++) {
			if(nums[0] == 0) {
				nums[0] =-rdN;
				continue;
			}
			//0이되면 무한루프(?)
			for(int j =0; j<1; j++) {
				if(rdN == nums[j]) {
					i--;
					break;
				}
			}
			System.out.println(rdN);
			
			//두가지의 수를 비교하는것도 가능하지 않나?
			
			
			
		}
						
		
		
		
		
	
	}

	
}
