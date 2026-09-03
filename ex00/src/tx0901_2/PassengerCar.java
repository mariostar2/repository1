package tx0901_2;

public class PassengerCar implements Car {
	
	@Override
	public void move() {
		System.out.println("소형차가 움직이는중");
		
	}
	@Override
	public void engine() {
		System.out.println("소형차의 엔진이 가동중입니다");
		
	}
	@Override
	public void size() {
		System.out.println("차의 사이즈는 소형차입니다");
		
	}
}
