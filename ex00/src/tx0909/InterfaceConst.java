package tx0909;

interface Scale {
	// interface의 필드는 public static final
	int DO = 0;
	int RE = 1;
	int MI = 2;
	int FA = 3;
	int SO = 4;
	int RA = 5;
	int TI = 6;
}

//클래스와 같은 = 필드를 가질수 있다
//필드값을 가질 수 있는 클래스
//필드도 메서드도 아닌 상수 용도의 객체  
enum Scale2 {
	DO, RE, MI, FA, SO, RA, TI;



	@Override
	public String toString() {
		return super.toString() + "입니디";
	}
}

public class InterfaceConst {

	public static void main(String[] args) {
		int sc = Scale.DO;
		System.out.println(sc);

		switch (sc) {
		case Scale.DO -> System.out.println("도");
		case Scale.RE -> System.out.println("레");
		case Scale.MI -> System.out.println("미");
		case Scale.FA -> System.out.println("파");
		case Scale.SO -> System.out.println("솔");
		case Scale.RA -> System.out.println("라");
		case Scale.TI -> System.out.println("시");
		}

		Scale2 sc2 = Scale2.DO;
		System.out.println(sc2);

		switch (sc2) {
		case DO:
			System.out.println("도 ~");
			break;
		case RE:
			System.out.println("레 ~");
			break;
		case MI:
			System.out.println("미 ~");
			break;
		case FA:
			System.out.println("파 ~");
			break;
		case SO:
			System.out.println("솔 ~");
			break;
		case RA:
			System.out.println("라 ~");
			break;
		case TI:
			System.out.println("시 ~");
			break;
		}

	}
	//이게됨?
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
