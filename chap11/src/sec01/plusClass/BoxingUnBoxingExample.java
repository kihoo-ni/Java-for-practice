package sec01.plusClass;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// Wrapper Ŭ���� �ڽ� (����)
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");

		// Wrapper Ŭ���� ��ڽ� (���� ����)
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		// int value3 = obj3; //�ڵ���ڽ�

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

		Integer obj4 = new Integer("200");
		Integer obj5 = new Integer("200");
		System.out.println(obj4 == obj5);

		int num1 = 100;
		int num2 = 100;

		System.out.println(num1 == num2);

		Integer num10 = 127; // 128�̻���� �� �νľ���. ���� ������ ����
		Integer num11 = 127;
		System.out.println(num10 == num11); // int�� 127���϶� true���� ==�����ڷ� �񱳰�����. ������ ������ȵ�.
		Integer num5 = 300;
		Integer num6 = 300;
		System.out.println(num5 == num6); // false ���� �񱳺Ұ�.
		System.out.println(num5.equals(num6)); // wrapper Ŭ������ �������� ������

		Integer obj6 = 100;
		// Integer obj6 = "100"; ���ڿ��̶� �ڵ��ڽ̾ȵ�.
		// Integer obj6 = new Integer("100");

		int i = 130;
		Integer i1 = new Integer(130);
		System.out.println(i == i1); // ����Ŭ������ �ڵ����� ��ڽ̵Ǽ� ������ ����.
	}

}
