package sec03.exam01;

public class AnimalExample {

	public static void main(String[] args) {
		
		Dog dog=new Dog();
		Cat cat=new Cat();
		
//		Animal animal=new Animal(); 추상클래스 객체생성 불가능
		
		dog.sound();
		cat.sound();
		
		Animal animal = new Dog(); // 자동타입변환
		animal.sound(); //오버라이딩된 Dog의 메소드 호출
		
		animalSound(new Dog()); //Animal animal = new Dog(); 자동타입변환과 메소드를 동시에 사용.
	}

	
	// 매개변수가 Animal 타입인 메소드
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
	
}
