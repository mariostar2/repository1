package tx0901;

public class TvUser {
	// static 정적 : 고정 할당-> 사라지기전까지 유지
	// 기능을 함수로 묶어서 매개변수로 인터페이스를 받는다
	public static void tvSelect(Tv tv) {
		tv.turnon();
		tv.turnoff();
		tv.volumeon();
		tv.volumoff();
	}

	public static void main(String[] args) {
		LgTv lgtv = new LgTv();
		SamsungTv smgtv = new SamsungTv();
		TvFactory tfc = new TvFactory("lgtv");
		TvFactory tfc2 = new TvFactory("smgtv");

		// 배열로 묶자 (tv 2개를 하나로)
		Tv[] tv = new Tv[2];
		tv[0] = lgtv;
		tv[1] = smgtv;

		// 반환된값
		// 함수를 선언했고 sysout으로 확인했을때 데이터 값이 넘어왔으니까 위에 선언부에서 getbrand값을 넣어주면 데이터를 그대로 보내준다
		tvSelect(tfc.getBrand());
		tvSelect(tfc2.getBrand());

	}
}