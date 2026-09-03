package tx0903;

public class Box2<Apple> {
	//제너릭
	//타입 파라미터 = <T> 
	//타입 안전성을 도모한다 
	private Apple ob;
	
	
	public void setOb(Apple o) {
		ob = o;
	}
	
	public Apple getOb() {
		return ob;
	}
}
