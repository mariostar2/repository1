package tx0828;

public class Ltt2 {
	int a;
	int b;
	//메소드 오버로딩 -- 기본생성자 명시
	public Ltt2(){
		
	}
	 
	public Ltt2(int n ,int m) {
		//this가 포함되어 있음
		//이 클래스 안에 있는 변수에 값을 대입해라 
		//이Ltt 클래스에 포함되어 있는 a를 가르키는것 = this
		this.a = n;
		this.b = m;
	}

	public static void main(String[] args) {
		//인스턴스를 호출할때 값안에 매개변수를 넣어준다 
		//주소변수를 입력해주지 않아서 자동으로 null값이 출력된다.
		Ltt1 l1 = new Ltt1(6,"0123");
		Ltt1 l2 = new Ltt1(5,"123");
		Ltt1 l3 = new Ltt1();
		Ltt1 l4 = new Ltt1(5);
		
		System.out.println(l1.n);
		System.out.println(l2.n);
		System.out.println(l3.n);
		System.out.println(l4.n);
	
		System.out.println(l1.s);
		System.out.println(l2.s);
		System.out.println(l3.s);
		System.out.println(l4.s);
		
		
	
		
	}

}
