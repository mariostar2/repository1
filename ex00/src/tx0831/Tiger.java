package tx0831;

public class Tiger extends Animal{

	
	public Tiger() {
		System.out.println("Tiger 클래스의 생성자를 호출했습니다");
	}
	
	@Override
	public void cry() {
		System.out.println("어흥~");
	}
}
