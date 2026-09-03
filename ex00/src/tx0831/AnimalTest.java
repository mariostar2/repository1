package tx0831;

public class AnimalTest {

	public static void main(String[] args) {
		//Animal ani = new Animal() {};
		//ani.cry();
		
		Dog dog = new Dog();
		dog.cry();
		dog.name = "츄피";
		Cat cat = new Cat();
		cat.cry();
		cat.name = "페르";
		Tiger tiger = new Tiger();
		tiger.cry();
		tiger.name = "조선고양이";

		// 중복 제거(배열)
		Animal[] animals = new Animal[3];
		animals[0] = dog;
		animals[1] = cat;
		animals[2] = tiger;
		
		
		//이름 구현 
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].name + ":");
			animals[i].cry();
		}
		
	

	}

}
