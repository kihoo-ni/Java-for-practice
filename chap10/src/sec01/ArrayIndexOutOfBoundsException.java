package sec01;

public class ArrayIndexOutOfBoundsException { // �迭 ���� ����

	public static void main(String[] args) {
		String[] a = new String[10];
		a[0] = "������";
		String data1 = a[0];

		System.out.println(data1);
		// args[0] = "��"; ���� �ϸ� ���� main�޼ҵ�� �氹�� �����ʿ� ����.
		String data2 = args[0];
		System.out.println(data2);
		// ����ȯ�� ������ 2���� ó���ϰ������ ������ �󸶹ٷ� 2����ó��
		// ���� "������ �󸶹�"��� 1���� ó��
	}

}
