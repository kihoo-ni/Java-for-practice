package sec01;

import java.util.Scanner;

public class NewIndexOfExample {

	public static void main(String[] args) {
		// �ּҸ� �Է¹޽��ϴ�.
		// �ּҿ� ����, �ξ�, ���, ������� �ϱ� ���ֹ��Դϴ�. ���
		// �ƴϸ� �ϱ� ���ֹ��� �ƴմϴ�. ��� indexOf ���

		Scanner s = new Scanner(System.in);
		System.out.println("�ּҸ� �Է��ϼ���");
		String address = s.next();

		if ((address.indexOf("����") != -1) || (address.indexOf("�ξ�") != -1) || (address.indexOf("���") != -1)
				|| (address.indexOf("���") != -1)) {
			System.out.println("�ϱ� ���ֹ� �Դϴ�.");
		} else {
			System.out.println("�ϱ� ���ֹ��� �ƴմϴ�.");
		}
	}

}
