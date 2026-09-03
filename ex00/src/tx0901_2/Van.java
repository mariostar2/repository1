package tx0901_2;

public class Van implements Car {

	@Override
	public void move() {
		System.out.println("중형차가 움직이는중");

	}

	@Override
	public void engine() {
		System.out.println("중형차의 엔진이 가동중");

	}

	@Override
	public void size() {
		System.out.println("사이즈는 중형차 입니다");

	}
}