package tx0903;

public class BoxTest2 {
	public static void main(String[] args) {

		// 박스 생성하기
		Box2<Apple> applebox = new Box2<>();
		// 박스 생성하기 오랜지용
		Box2<Orange> orangebox = new Box2<>();

		// 사과박스에 사과 담기
		applebox.setOb(new Apple());

		// 오랜지박스에 오랜지 박스
		orangebox.setOb(new Orange());
		
		//사과박스에서 사과 꺼내서 전용 변수에 담기
		Apple apple = applebox.getOb();
		
		//오렌지박스에서 어렌지 꺼내서 전용변수에 담기
		Orange orange = orangebox.getOb();
		
		//사과 변수 출력하기 
		System.out.println(apple);
		
		//오렌지 변수 출력하기
		System.out.println(orange);
	}

}
