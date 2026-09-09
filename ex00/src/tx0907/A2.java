package tx0907;

public class A2 extends A3 {
	private String c;
	private String d;

	public A2(int e, int f, String c, String d) {
		super(e, f);
		this.c = c;
		this.d = d;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String toString() {
		return String.format(c, d);
	}
}
