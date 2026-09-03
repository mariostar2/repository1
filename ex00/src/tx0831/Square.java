package tx0831;

//상속 
public class Square extends Shape{

	// 직사각형
	private int width;
	//private int height;

	public Square() {

	}

	public Square(int width, int heigth) {
		this.width = width;
		//this.height = heigth;
	}

	
	public int[] toString(Square s1) {
		System.out.println("(width*height)");
		return toString(s1);
	}

}
