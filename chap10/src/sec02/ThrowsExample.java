package sec02;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findclass();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}

	public static void findclass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.util.Scaner"); //scanner�� �ϸ� �ƹ��͵� �ȳ���
	}

}
