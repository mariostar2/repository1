package tx0902;

public class B extends A {
	
	public static void main(String[] args) {
		A a = new B();
		B b = (B) a;
		b.s();
		System.out.println(b);
	}
	
	
	
}
