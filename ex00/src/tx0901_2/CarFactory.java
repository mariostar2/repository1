package tx0901_2;

public class CarFactory {
	private String brand;
	private int size;
	
	public CarFactory(int size) {
		this.size = size;
	}
	
	public Car getBrand() {
		if(brand.equals("passCar")) {
			
		}else if(brand.equals("van")){
			
		}else {
			return null;
		}
		if(size == 0) {
			System.out.println("소형차입니다");
		}else if(size ==1) {
			System.err.println("중형차입니다");
		}else {
			System.out.println("차가 아님");
			return null;
		}
		return null;
	}
}
