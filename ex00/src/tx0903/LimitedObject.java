package tx0903;

import java.util.Scanner;

public class LimitedObject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 3;
		int arr = 3;

		String[] nameArr = new String[num];

		for (int i = 0; i < num; i++) {
			boolean flag = false;

			//입력단
			System.out.print("문자열 입력 테스트 시작 하겠습니다 (" + (i + 1) + "): ");
			nameArr[i] = sc.nextLine();

			
			for (int j = 0; j < i; j++) {
				if (nameArr[j] != null && nameArr[i].equals(nameArr[j])) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("중복발생!");
				i--;
				continue;
			}
			if (i == num - 1) {
				int oldNum = num;
				num += arr;
				String[] tempArr = new String[num];
				for (int j = 0; j < oldNum; j++) {
					tempArr[j] = nameArr[j];
				}
				nameArr = tempArr;
			}
			System.out.print("현재 목록: ");
			for (int j = 0; j <= i; j++) {
				System.out.print(nameArr[j] + (j == i ? "" : ", "));
			}
			System.out.println();
		}
		sc.close();
	}
}