package tx0903;

public class FruitAndBox {
	public static void main(String[] args) {
		
		Apple apple =new Apple();
		Orange orange =  new Orange();
		
		//사과박스
		Box appbox = new Box();
		//오렌지 박스
		Box orgbox =  new Box();
		
		//사과박스에 사과 담기
		appbox.setOb(apple);
		//오렌지 박스에 사과 담기.
		orgbox.setOb(orange);
		
		//사과박스에서 사과를 꺼내서 전용 볌수에 담기 (형변환)
		Object ap = appbox.getOb();
		Apple ap1 = (Apple) appbox.getOb();
		//오랜지 박스에서 오랜지를 꺼내서 전용 변수에 담기
		Object og = orgbox.getOb();
		Orange og1 =(Orange) orgbox.getOb();
	
		//사과 변수 출력
		System.out.println(ap);
		//오랜지 변스 출력
		System.out.println(og);
	}
}
