package sec04;

import java.util.Scanner;

public class ��������2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String password;

		while (true) {
			System.out.println("����� ��й�ȣ�� �Է��ϼ���");
			password = s.nextLine();

			if (password.equals("1234")) {
				System.out.println("ȯ���մϴ�.");
				break;

			}

			System.out.println("��й�ȣ�� Ʋ���ϴ�.");

		}

	}
}
