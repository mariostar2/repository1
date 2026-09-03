package tx0901;

//자식 1
public class Bus extends Transportation {

	// 1번 버스에 몸을 실어보다
	public void goBus() {
		System.out.println("부산행 버스에 몸을 실고");
	}

	//(부모의 go 메소드를 ->자식 상속시켜줌)
	@Override
	public void go() {
		System.out.println("부산행 버스 ");
	}

}
