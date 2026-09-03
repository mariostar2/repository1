package tx0901;

public class TravelTest {

	public static void main(String[] args) {

		// 인스턴스 생성
		// 2 버스 인스턴스 생성
		Bus bus = new Bus();
		// 2-1 기차 인스턴스 생성
		Train train = new Train();
		BusanTravel bust = new BusanTravel();
		//자식타입의 참조변수를 부모를 대상으로 넣어도 작동한다.
		Transportation tr = new Train();
		Transportation tr2 = new Bus();
		

		// 호출문
		bus.goBus();
		// 상속받은 버스
		bust.goBusan(bus);
		train.goTrain();
		// 상속받은 기차
		bust.goBusan(train);

	}

}
