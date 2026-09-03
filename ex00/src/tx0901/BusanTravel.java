package tx0901;

public class BusanTravel {

//	public  void goBusanByBus(Bus bus) {
//		bus.goBus();
//		System.out.println("버스 출발");
//	}
//
//	public void goBusanByTrain(Train train) {
//		train.goTrain();
//		System.out.println("기차 출발");
//	}

	// 상속
	// 부모타입인 메소드로는 접근이 불가능해서 형변환을 해서 자식타입의 참조변수로 갈아타는것
	// 캐스팅을 해서 부모가 자식에게 접근가능하게 손바닥을 체인지한다(갈아끼운다) == c에 포인터를 생각하자
	public void goBusan(Transportation tt) {
		// 캐스팅 불가
//		Train train = (Train)tt;
//		train.goTrain();

		// 조건문 처리 해서
		tt.go();
	}
	
	//메소드 오버라이드
	public void goBusan2(Transportation tt) {
		//trans 의 인스턴스가 버스랑 같은가?
		if(tt instanceof Bus) {
			Bus bus = (Bus)tt;
			bus.goBus();
		}else if(tt instanceof Train){
			Train train = (Train)tt;
			train.goTrain();
		}
	}
}