package tx0902;

public class Human {

	//정적 :종료전 까지 유지
	static int number; //모든 인스턴스가 공유하는 변수(고정)static 선언시에 고정되는 값으로 바뀌고
	String name;
	
	//변수를 하나더 두자
	//동적: 실행후 바로 사라짐
	int hNum; //각 인스턴스가 갖게 되는 고유 번호.(고유)일반 자료형이니까 고정이 아닌 고유 번호를 가지고 순서대로 증가하도록 만드는 변수를 선언
	
	//생성자 호출시 인스턴스 증가 
	public Human(String name) {
		hNum= ++number; //연산자가 뒤에 붙으면 num이 0인 상태에서 1로 증가하지만 앞에 붙으면 바로 1부터 시작 (초기값 시작이 달라진다)
		this.name = name;
	}
	
	public static void h1() {
		System.out.println("1번 인간");
	}


	
}
