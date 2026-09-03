package tx0901_2;

public class CarSystem {

	public static void carSelect(Car car) {
		car.move();
		car.engine();
		car.size();
	}
	
	public static void main(String[] args) {
		Van van = new Van();
		PassengerCar psc = new PassengerCar();

		// 배열
		Car[] car = new Car[2];
		car[0] = van;
		car[1] = psc;
		
	
		carSelect(psc);
		carSelect(van);
		try {
			carSelect(null);
		}catch (Exception e) {
			System.out.println("예외발생");
		}
		
	}
	
	

}
