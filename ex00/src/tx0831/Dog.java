package tx0831;

public class Dog extends Animal {
	public Dog() {
		System.out.println("Dog 클래스의 생성자를 호출 했습니다");
	}
	@Override
	public void cry(){
		System.out.println("멍멍~");
	}	
}
