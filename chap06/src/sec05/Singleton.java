package sec05;

public class Singleton {

	// �����ʵ�
	private static Singleton singleton = new Singleton();

	// ������
	private Singleton() {

	}

	// ���� �޼ҵ�
	static Singleton getInstance() {
		return singleton;
	}

	public static void main(String[] args) {
		/*
		 * Singleton obj1 = new Singleton(); 
		 * Singleton obj2 = new Singleton(); �ι��̻� ��ü�����Ұ�
		 */

		Singleton obj1 = Singleton.getInstance(); //Ķ����Ŭ������ �����ѳ� 
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("���� ��ü");
		} else {
			System.out.println("�ٸ� ��ü");
		}
	}
}
