package tx0907_1;

public class A {
	private int a;
	private String s;
	
	public A(int a ,String s) {
		this.a = a;
		this.s = s;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s =s;
	}
	
	public String toString() {
		return String.format( "번호 :%d, 이름 :%s", a,s);
	}
	 
	 
}
