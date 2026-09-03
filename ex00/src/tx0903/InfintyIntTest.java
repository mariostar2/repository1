package tx0903;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;



public class InfintyIntTest {

	public static void main(String[] args) {
		LimitInt li = new LimitInt(5);
		while(true) {
			System.out.println("숫자를 입력해주시겠어요?");
			Scanner sc = new Scanner(System.in);
			
	
			//li.add();
			//li.insert();
			li.remove();
			li.removeall();
			li.get();
			li.modify();
		
		
}
		
		
		
		
	}

}
