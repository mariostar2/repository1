package tx0831;

/*
 * 추상 클래스
 */
public abstract class Animal {
	
	String name;
	
	public Animal() {
		System.out.println("Animal은 호출되고 있습니까?");
	}
	public abstract  void cry();
	
	public String name() {
		return name;
	}

}
