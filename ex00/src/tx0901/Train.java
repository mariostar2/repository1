package tx0901;

//second 자식 
public class Train extends Transportation {

	// 1-1
	public void goTrain() {
		System.out.println("부산행 기차에 몸을 실고");
	}

	//Transportation(부모의 go 메소드를 ->자식 상속시켜줌)
	@Override
	public void go() {
		System.out.println("부산행 기차");

	}
}
