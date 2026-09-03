package tx0831;

public class Human extends Parent implements Paintable, Shootable {

	/*
	 * interface implements
	 */
	public void study() {
		System.out.println("공부합니다");
	}

	// 형태는 건들지말고 기능만 구현
	@Override
	public void paint() {
		System.out.println("동양화를 그려봅시다.");

	}

	@Override
	public void shooting() {
		System.out.println("M16 사격을 합니다.");

	}

}
