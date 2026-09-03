package tx0901;

public class TvFactory {
	
	private String brandName;
	//SamsungTv smgtv = new SamsungTv();
	//LgTv lgtv = new LgTv();
	//생성자로도 데이터를 넣을수 있다
	public TvFactory(String s) {
		this.brandName = s;
	}
	
	/*
	 * 문자열을 반환할때는 위에서 선언한 문자열인 brandName에 equals 함수를 사용
	 * () 를 선언해주고 "" <-- 문자열 사용시 괄호를 먼저 치고 안에 쌍따옴표
	 * return 타입은 미리 만든 선언문에 티비를 필요로 하기에 if -else 문에서 반환타입을 티비로 받아오고
	 * 그게 아니라면 삼성티비를 받아온다 new라는 새로운 객체를 생성하고 
	 * 그리고 getbrand 자료쪽을 인스턴스로 만든 tv를 사용하도록한다 
 	 */
	public Tv getBrand() {
		//만약에 필드<< 브렌드네임이 엘지면 엘지 인스턴스를
		// 삼성이면 삼성 인스턴스 객체를 내보낸다
		//==비교연산은 자료형에는 가능하나 문자열에는 불가능하다 
		if( brandName.equals("lgtv")) {
			return  new LgTv();
		}else if(brandName.equals("smgtv")) {
			return new SamsungTv();
		}else {
			return null;
		}
	}
	
	
}
