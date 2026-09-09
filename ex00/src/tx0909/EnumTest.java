package tx0909;



enum Human{
	//enum(열거형)은 값(MAN,WOMAN)은 Human 타입(자료형) 인스턴스다
	//enum 은 클래스이므로 새성자가존재한다, 직접 기술하지 않으며 기본생성자가 삽입ㄴ된다
	//enum 은 생성자private 으로 선언되며 new를 통한 직접 인스턴스 생성이 불가능하다
	MAN,WOMAN;
	Human(){
		System.out.println("HUMAN 생성자를 호출");
	
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I am a human";
	}
}
	

//휴먼 인터페이스
//인터페이스 제한
public class EnumTest {
	//enum의 값은 "타임명.값" 으로 표기한다 예)Human.MAN
	//그런데 , switch문에선,ㄴ case문을 사용하여 구문에 "타입명" 을 기술하지 않도록 규정

	public static void main(String[] args) {
		System.out.println(Human.MAN);
		//System.out.println(Human.WOMAN);
	
		
	}
}
