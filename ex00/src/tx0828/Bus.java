package tx0828;

public class Bus {

	String num;
	// 버스 번호
	// 생성자
	int passengerCnt = 1;
	int income = 3000;

	// 버스 인스턴스 정의 (2)
	public Bus(String num, int passengerCnt, int income) {
		this.num = num;
		this.passengerCnt = passengerCnt;
		this.income = income;
	}

	// 학생이 버스를 탑승 하는 정보(5)
	// 돈을 차감 -> 버스탑승인원이 증가
	// 학생이 가진돈에서 버스비를 차감시키고 버스는 거기서 돈을 증가시켜야한다
	public void takeBus(Student student, int passengerCnt) {

		student.money -=income; // 학생이 가진돈에서 버스비를 차감시키고
		income++; //버스비를 가진 버스는 버스비를 증가시킴
		// 버스에 탑승하고 있는 인원을 증감시킨다.
		++passengerCnt;
		
	}

}
