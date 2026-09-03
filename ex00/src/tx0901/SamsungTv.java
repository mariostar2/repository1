package tx0901;

public class SamsungTv implements Tv {

	@Override
	public void turnon() {
		System.out.println("삼성 티비 전원 켜짐");
	}
	@Override
	public void turnoff() {
		System.out.println("삼성 티비 전원 꺼짐");
	}
	@Override
	public void volumeon() {
		System.out.println("삼성 티비 사운드 올림");
	}
	@Override
	public void volumoff() {
		System.out.println("삼성 티비 사운드 올림");
	}
}
