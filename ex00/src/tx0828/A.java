package tx0828;

public class A {
	//메인
	public static void main(String[] args) {
		//선언
		B b= new B();
		//get으로 가져온것
		b.getN();
		//set으로 가져온것
		b.setN(10, "문자를 가져옴");
		
		System.out.println(b);
		
	}

}
