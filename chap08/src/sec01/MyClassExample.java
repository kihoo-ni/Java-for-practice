package sec01;

public class MyClassExample {

	public static void main(String[] args) {
		MyClass my1 = new MyClass();
		// ����Ʈ ������ ȣ��
		my1.rc.turnOn();
		my1.rc.setVolume(7);

		MyClass my2 = new MyClass(new Television());
		// �Ű����� 1�� ������ ȣ��
		my2.rc.turnOn();
		my2.rc.setVolume(7);
		
		MyClass my3 = new MyClass(new Audio());
		// �Ű����� 1�� ������ ȣ��
		my3.rc.turnOn();
		my3.rc.setVolume(7);
		
		MyClass my4 = new MyClass();
		// �Ű������� ���� �޼ҵ� ȣ��
		my4.methodA();
		
		MyClass my5 = new MyClass();
		my5.methodB(new Television());
		
		
		
	}

}
