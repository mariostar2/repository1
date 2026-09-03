package tx0903;

public class LimitInt {

	int num;
	private int[] arr;
	private int count = 0; //현재 저장된 배열의 갯수

	public LimitInt(int num) {
		this.num = num;
		arr = new int[num];

	}
	
	//추가ㄴ
	public void add(int value) {
		if(count >= num) {
			System.out.println("배열이 다참");
			return;
		}
		arr[count] = value;
		count ++;
		System.out.println("입력된 값" + value +"/"+ "현재 갯수 :" + count + "개");
	}

	public void insert(int add) {
		if(num <=0 || count >=num ) {
			System.out.println("추가된값" + add);
		}
		
	}

	// 데이터수정
	public int[] remove() {

		return arr;
	}

	public void removeall() {

	}

	public void get() {

	}

	public void modify() {

	}

	
}
