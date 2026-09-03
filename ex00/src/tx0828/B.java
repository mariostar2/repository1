package tx0828;

//일반
public class B {

	private int n ;
	private String s ;

	//getter(내부에 있는값을 외부로) 반환타입이 있다
	public int getN() {
		return n;
	}
	//게터
	public String getS() {
		return s;
	}
	
	//어떤값이 들어올지 모름(setter)
	public void setN(int n, String s) {
		this.n = n;
		this.s = s;
	}
	//클래스 안에 있는 필드정보를 문자열로 만들어라
	//재정의

	public String toString() {
		return "n의값:" +n + "s의값:" +s;
	}
	
	//덮어쓰다 재정의하다 
	//@Override
	
	
	
}
