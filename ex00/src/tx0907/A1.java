package tx0907;

public class A1 extends A3 {

	private int a;
	private int b;
	
	int n;
	String s;
	
	

	public A1(int e, int f, int a, int b) {
		super(e, f);
		this.a = a;
		this.b = b;

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public String toString() {
		return String.format("테스트1 , 테스트 2", a, b);
	}

}
