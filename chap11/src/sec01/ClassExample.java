package sec01;

public class ClassExample {

	public static void main(String[] args) {

		Key key = new Key(50); // (��ü�� ���� ����)
		Class clazz = key.getClass();
		System.out.println(clazz.getName()); // ��Ű���� Ŭ���� �̸����

		Class clazz2 = Member.class; // (Ŭ������ ���� ��ü ����)
		System.out.println(clazz2.getSimpleName()); // Ŭ���� �̸����

	}

}
