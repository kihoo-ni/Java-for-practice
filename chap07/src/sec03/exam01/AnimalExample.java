package sec03.exam01;

public class AnimalExample {

	public static void main(String[] args) {
		
		Dog dog=new Dog();
		Cat cat=new Cat();
		
//		Animal animal=new Animal(); �߻�Ŭ���� ��ü���� �Ұ���
		
		dog.sound();
		cat.sound();
		
		Animal animal = new Dog(); // �ڵ�Ÿ�Ժ�ȯ
		animal.sound(); //�������̵��� Dog�� �޼ҵ� ȣ��
		
		animalSound(new Dog()); //Animal animal = new Dog(); �ڵ�Ÿ�Ժ�ȯ�� �޼ҵ带 ���ÿ� ���.
	}

	
	// �Ű������� Animal Ÿ���� �޼ҵ�
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
	
}
