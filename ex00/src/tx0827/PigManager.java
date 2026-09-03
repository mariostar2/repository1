package tx0827;

public class PigManager {
		
	
	
	// 기존의돈 + 넣은돈
	// 기존에 남은잔액과 넣은돈 투입 
	

	public static void main(String[] args) {

		// 데이터를 가져오기
		PigMoneyBox pigbox = new PigMoneyBox();
		pigbox.name = "Jhoo";
		pigbox.money = 8000;
		pigbox.balance = 25000;
		pigbox.days = 1350 / 2 / 3;
		
		
		PigMoneyBox pigbox2 = new PigMoneyBox();
		pigbox.name = "Jno";
		pigbox.money = 12000;
		pigbox.balance = 25000;
		pigbox.days = 1850 / 2 / 3;
		
		
		PigMoneyBox pigbox3 = new PigMoneyBox();
		pigbox.name = "Elice";
		pigbox.money = 6000;
		pigbox.balance = 12000;
		pigbox.days = 1950 / 2 / 3;
		
		if(pigbox.balance ==0) {
			System.out.println("남은잔액이 있습니다");
		}else {
			System.out.println("남은 잔액이 없다");
		}
		
		// 돈을 넣는다?행동(테스트중)
		if (pigbox.balance > 25000) {
			System.out.println("잔액을 불러와짐");
		} else {
			System.out.println("잔액을 불러오기 실패");
		}
	}
}