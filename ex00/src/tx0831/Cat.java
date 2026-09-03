package tx0831;

public class Cat extends Animal {
	public Cat() {
		System.out.println("Cat 클래스의 생성자를 호출 했습니다");
	}
	@Override
	public void cry () {
		System.out.println("야용~");
	}
}
