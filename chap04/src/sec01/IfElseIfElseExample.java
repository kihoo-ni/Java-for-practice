package sec01;

import java.util.Scanner;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		// 7000��¥�� ���ἱ����Ʈ�� �������� �� �����ؾ��ϴ� �ݾ���?
		// ��, 8�� �̻� ���� �ÿ��� 10% ������ ��. if-else�� ���.
		Scanner s = new Scanner(System.in);
		System.out.println("���ἱ����Ʈ�� ��� �����ߴ°�?");
		int drink = s.nextInt();
		double result;
		if (drink >= 8) {
			result = drink * 7000 * 0.9; // result=drink*6300; << 10% ���� �Ȱ����� ��ȯ�Ҽ�����.
			System.out.println("������ " + (int) result + "�Դϴ�.");
		} else {
			result = drink * 7000;
			System.out.println("������ " + (int) result + "�Դϴ�.");
		}
	}

}
