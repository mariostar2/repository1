package tx0831;

public class Quadrangle {
	private int width;
	private int height;
	
	public Quadrangle(int width,int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}

}
