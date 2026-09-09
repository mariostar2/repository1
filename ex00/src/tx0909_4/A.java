package tx0909_4;

public class A {

	private int m;
	private String s;

	public A(int m, String s) {
		this.m = m;
		this.s = s;
	}

	

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "A [m=" + m + ", s=" + s + "]";
	}

}
