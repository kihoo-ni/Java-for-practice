package sec01;

public class NullPointerExceptionExample { // �� ������ ����
	public static void main(String[] args) {
		String data = null;
		int num = 5;
		//System.out.println(data.toString()); // data ������ �ΰ� �־��� ������ ���� �߻�.
		// ���� ���� �߻� : ���� �ڵ�� Ȯ���ؾ���.

		String e = String.valueOf(data);
		System.out.println(e); // valueOf�� null �� ó����.

		// System.out.println(num.toString());
		System.out.println(Integer.toString(num)); // �̷��� �ϸ� ����.
		// �Ϲ� ���� �߻�: ���α׷��Ӱ� �̸� Ȯ�� ������.

		String b = String.valueOf(num);
		System.out.println(b);

		String c = Integer.toString(num);
		System.out.println(c);
		
		String num1="�̱���";
		System.out.println(num1.toString());
		// valueOf, toString ��� Object Ÿ���� ���� String ���� ��ȯ��.
		// �� toString�� null ó�� �ȵ�
		// Object ��� ���� String �ƴϿ��� ���

		// valueOf�� null �� ó�� ��.
		
	}
}
