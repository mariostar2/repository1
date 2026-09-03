package tx0831;

public class DiagramSys {
	
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(10, 20);
		Square s1 = new Square(10,20);
		Oblong ob1 = new Oblong(20,20);
		Traingle tr1 = new Traingle();
		Circle c1 =  new Circle(9);
		
		Shape[] shapes = new Shape[3];
		shapes[0] = r1;
		shapes[1] = s1;
		shapes[2] = c1;
		
		/*
		 * 상속:타입의 일치를 도모할 수 있다(서로 다른 타입을 하나로 묶는게 가능)
		 */
		//타입이 일치하므로 사용가능(상속)
		for(int i =0;  i<3; i++) {
			System.out.println(shapes[i].getArea());
		}
		//
		
		//호출문 
//		System.out.println(s1.toString());
//		System.out.println(ob1.toString());
//		System.out.println(tr1.toString());
//		System.out.println(c1.toString());
//		
		
	}
}
