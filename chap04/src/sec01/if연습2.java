package sec01;

import java.util.Scanner;

public class if����2 {

	public static void main(String[] args) {
		// int type ���䰹������ 3�� ���� �Ѱ����̶� 6�����ϸ� ���հ���� ���հ����� 30�� �̻��̸� �հ� ���
		// if-else����� or ���
		Scanner s = new Scanner(System.in);
		System.out.print("������� ���� ������? ");
		int x = s.nextInt();
		System.out.print("���а��� ���� ������? ");
		int y = s.nextInt();
		System.out.print("������� ���� ������? ");
		int z = s.nextInt();

		if (x <= 6 || y <= 6 || z <= 6 || (x + y + z < 30)) {
			System.out.println("���հ��Դϴ�.");
		} else {
			System.out.println("�հ��Դϴ�.");
		}

		// and �������� ������ ������ ����.
		// if (x > 6 && y > 6 && z > 6 && (x + y + z >= 30)) {
		// System.out.println("�հ� �Դϴ�.");
		// } else {
		// System.out.println("���հ� �Դϴ�.");
		// }

	}

}
