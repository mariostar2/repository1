package tx0907;

import java.util.Objects;

public class B {
	int n;
	String s;

	public B(int n, String s) {
		this.n = n;
		this.s = s;
	}

	@Override
	public String toString() {
		return "n = " + n + ", s = " + s;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		B x = (B) obj;

		return (n == x.n) && (s.equals(x.s));
	}

	@Override
	public int hashCode() {
		return Objects.hash(n, s);
	}
}
