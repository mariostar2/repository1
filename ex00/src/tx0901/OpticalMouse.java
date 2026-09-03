package tx0901;

public class OpticalMouse extends Mouse {
	
	@Override
	public void cilckLeft() {
		System.out.println("휠 마우스 왼쪽 클릭");
		super.cilckLeft();
	}
	
	@Override
	public void cilckRight() {
		System.out.println("휠 마우스 오른쪽 클릭");
		super.cilckRight();
	}
	
	
}
