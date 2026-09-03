package tx0901;

//추상클래스로 만들면서 
//상속받았는데 미완성 
//인스턴스는 물려주는게 안된다 
public class  TrainImple implements TravelInter {
	
	
	
	//인터페이스에서 기능 받아옴
	@Override
	public void Tranveling() {
		System.out.println("ba가 달린다 ");
	}
	
	
	
}
