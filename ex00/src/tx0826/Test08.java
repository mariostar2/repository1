package tx0826;

import java.util.Random;

public class Test08 {

	public static void main(String[] args) {
		// 랜덤수를 생성한다
		Random rd = new Random();
		// 6개의 배열을 생성할건데 그게 nums
		int[] nums = new int[6];
		// 0~5 +1 = 1~6 무작위로 난수를 생성 
		int rdNum = rd.nextInt(6) + 1;
		// 첫번째자리는 중복일 수 없으니 0을 저장하는데 nums 인덱스에
		// nums[0] = rdNum;

		/*
		 * flag라는 변수로 선언할 타입은 boolean 비교 연산을 위해 true라고 명시
		 */
		boolean flag = true;
		/*
		 * 우리가 원하는 숫자는 1부터니까 nums 배열의 길이만큼 위에 있는 수대로 표시
		 */
		for (int i = 1; i < nums.length; i++) {
			// 위에 코드처럼 0~5가아니라 1~6까지 출력 가능하도록 +1
			rdNum = rd.nextInt(6) + 1;

			// 첫번째 랜덤수는 중복검사없이 nums 배열 인덱스 0에 저장
			if (nums[0] == 0) {
				nums[0] = rdNum;
				// 이후 명령 생략하고 넘김
				continue;
			}
			for (int j = 0; j < 1; j++) {
				// 비교: rdnum에 1과 nums 배얄의 길이가 일치하는가 비교
				// 중복이 발견되었을때 다시 뽑는 로직으로 이동
				if (rdNum == nums[j]) {
					i--;
					flag = false;
					break;
				}
			}
			if (flag) {
				nums[i] = rdNum;
			}
			flag = true;
		}
		for (int i = 1; i < rdNum; i++) {
			System.out.println(rdNum);
		}

	}

}
