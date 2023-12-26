package sec01;

public class ClassCastException { // 클래스 타입변환 예외

	public static void main(String[] args) {
		Animal animal = new Dog();
		Dog dog = (Dog) animal;

		Animal animal2 = new Dog();
		Cat cat = (Cat) animal2;
	}

}
