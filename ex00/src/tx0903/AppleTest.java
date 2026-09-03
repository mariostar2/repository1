package tx0903;

public class AppleTest {
	
	public static void main(String[] args) {
		
		//Apple apple = new Apple();
		
		Object o  =new Object();
		System.out.println(o.toString());
		
		Object o2 = new Apple();
		System.out.println(o2.toString());
		
		
		//상속 관계 일때만 가능하다 (형변환) 가면쓰기
		Apple a =(Apple)o2;
		
	}
	
	
}
