package sec04;

public class PrintfExample {

	public static void main(String[] args) {
		int A = 123;
		System.out.printf("��ǰ�� ����: %d��\n", A);
		System.out.printf("��ǰ�� ����: %6d��\n", A);

		int A1 = 1234;
		System.out.printf("��ǰ�� ����:%d��\n", A1);
		System.out.printf("��ǰ�� ����:%6d��\n", A1);
		System.out.printf("��ǰ�� ����:%-6d��\n", A1);

		double area = 3.14159 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����:%10.3f\n", 10, area);

		String name = "ȫ�浿";
		String job = "����";
		System.out.printf("%6d|%-10s|%10s\n", 1, name, job);

		
		
		
		
		
		
	}

}
