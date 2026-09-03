package tx0828;

public class Student {

	// 학생이 버스를 타면 1000원의 돈을 내고 탄다
	// 학생은 돈이 없으면 못탐
	// 학생은 태어날때 기본적으로 5천원 이상을 있는 돈으로 나온다
	// 버스에서는 학생 3명을 버스를탄다 버스는 1대이다
	//3명학생의 이름과 돈 
	//그 번호가 있는 버스의 승객수와 버스를 출력
	String name;
	int money;	
	
	//학생 인스턴스 정의(1)
	public Student(String name,int money) {
		this.name = name;
		this.money = money;
	}
	
	//생성자의 상태(4) -- 학생이 버스를 탑승하면 돈만 넘겨줘야하나?
		public void rideBus(Bus bus ){
		money = money -3000;
		//(7) 버스탑승한 차감금액을 넘겨줘야함)
		//bus.takeBus(money,3000);
	}
	
	//학생이 소유하고 있는돈 (6)
	public void showInfo() {
		System.out.println(name+" 학생이 가진 돈이 " +  money  + "원입니다");
	}


	
	
	

}


