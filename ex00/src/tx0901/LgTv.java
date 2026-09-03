package tx0901;

public class LgTv implements Tv {

	// 매서드
	@Override
	public void turnon() {
		System.out.println("LG 티비 전원 켜짐");
	}

	@Override
	public void turnoff() {
		System.out.println("LG 티비 전원 꺼짐");
	}

	@Override
	public void volumeon() {
		System.out.println("LG 티비 소리 올림");
	}

	@Override
	public void volumoff() {
		System.out.println("LG 티비 소리 낮춤");
	}
}
