package tx0831;

public class Tx1 {

	// 메인 메소드가 없는 정수를 저장하는 클래스
	// 크기가 3
	// 메인 클래스 출력
	// add라는 4번 호출해서 outof에러

	private int[] a;
	int idx = 0;

	// 기본 생성자는 이름이 같아야한다
	public Tx1() {
		a = new int[3];
	}

	// 기능
	void printA() {
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i]);
		}
	}
	// 매개변수 3개 세터
	// 게터 배열 int 반환형 게터
	// a라는 변수에서 가져다주는것
	// 필드가 가지고 있는 값을 걍 내주는것

	public int[] getA() {
		return a;
	}

	// 매개변수 (void)
	public void setA(int[] a) {
		this.a = a;
	}

	// 3개를 받아야하는데
	public void add(int value) {
		// idx라고 지정
		// out of bound 매개변수를 value a값에다가 선어
		if (idx < a.length) {
			/*
			 * 만약idx <a의 인덱스 길이보다 짧다면
			 */
			a[idx] = value; // a배열 인덱스에 value라는 매개변수를 주입하고
			idx++; // idx 증감시킨다
		} else {
			/*
			 * 새로운 int 배열을 만드는데 a배열에서 +3씩 증가하도록 만든다
			 */
			int[] temp = new int[a.length + -1];
			// 반복문을 사용해서 a의 길이만큼 증가
			for (int i = 0; i < a.length; i++) {
				temp[i] = a[i];
			}
			// temp의 값을 a에 대입
			a = temp;
		}
		// 여기서 아웃오브 바인드
	}
	public int size() {
	
		return 0;
	}
}
