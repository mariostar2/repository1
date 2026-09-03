package tx0831;

public class Circle extends Shape {
	private int radius;
	private final double pi = 3.14f;

	public Circle(int radius) {
		this.radius = radius;
	}

	// 상속
	public double getArea() {
		return radius * radius * pi;
	}

}