package tx0901;

public class MouseTest {

	public static void main(String[] args) {
		// Mouse인스턴스 생성
		Mouse m = new Mouse();
		m.cilckLeft();
		m.cilckRight();
		// WheelMouse 인스턴스 생성
		WheelMouse wm = new WheelMouse();
		wm.cilckLeft();
		wm.cilckRight();
		wm.scroll();
		// OpticalMouse 인스턴스 생성
		OpticalMouse om = new OpticalMouse();
		om.cilckLeft();
		om.cilckRight();

		// 배열 정의
		Mouse[] mouses = new Mouse[3];
		mouses[0] = m;
		mouses[1] = wm;
		mouses[2] = om;

		// 반복문
		for (int i = 0; i < mouses.length; i++) {
			mouses[i].cilckLeft();
			mouses[i].cilckRight();
		}

		// 항상된 for문 사용 위에꺼랑 같다
		for (Mouse mouse : mouses) {
			mouse.cilckLeft();
			mouse.cilckRight();
		}

		// mouse가 부모 밑에 두개의 휠마우스 옵티컬이 자식인데 부모 클레스가 메인으로 나오는 상태인데
		// 위치를 바꾸어서 부모를 제일 아래로 그 위에 자식클래스를 순서대로 올리면 출력할때 위치를 변경하는게 가능하다.
		for (int i = 0; i < mouses.length; i++) {
			if (mouses[i] instanceof Mouse) {
				System.out.println(i + "번 인덱스는 일반 마우스...");
			} else if (mouses[i] instanceof WheelMouse) {
				System.out.println(i + "번 인덱스는 휠마우스...");
			} else if (mouses[i] instanceof OpticalMouse) {
				System.out.println(i + "번 인덱스는 광마우스...");
			}
		}

		System.out.println("==============================================");
		// mouses 인스턴스의 실제 클래스일때 실제 인스턴스가 어디로 나왔는가 알려주는 클래스 (클래스 == 클래스 끼리 비교한다)
		// 순서에 따라 다른 결과가 나올 수 있다.
		for (int i = 0; i < mouses.length; i++) {
			if (mouses[i].getClass().equals(Mouse.class)) {
				System.out.println(i + "번 인덱스는 일반 마우스...");
			} else if (mouses[i].getClass().equals(WheelMouse.class)) {
				System.out.println(i + "번 인덱스는 휠마우스...");
			} else if (mouses[i].getClass().equals(OpticalMouse.class)) {
				System.out.println(i + "번 인덱스는 광마우스...");
			}
		}

	}
}