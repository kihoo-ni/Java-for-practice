package test;

import java.util.Scanner;

public class Ȯ�ι���1re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("����� �̸���?");
		String name = s.next();
		System.out.println("�߰���� ������?"); // ��)83.67 �Ҽ��� ���ڸ����� �Է�
		double mid = s.nextDouble();
		System.out.println("�⸻��� ������?");
		double last = s.nextDouble();
		System.out.println("����Ʈ ������?");
		double report = s.nextDouble();
		// printf ����ؼ� �ѹ��� ���, ȫ�浿���� ��� ������ : 73.25�Դϴ�. %5.2f�� ����
		double averagescore = (mid + last + report) / 3;

		System.out.printf("%s���� ��� ������ : %5.2f �Դϴ�.", name, averagescore);
		
		
		
	}
}
