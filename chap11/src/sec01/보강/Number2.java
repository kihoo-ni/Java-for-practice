package sec01.����;

import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean x = true;
		while (x) {
			System.out.println("������ �����մϴ�.\n");
			System.out.println("�� ������ ���� �Է��ϼ���");
			String word1 = s.nextLine();
			if (word1.equals("�׸�")) {
				System.out.println("�����մϴ�.");
				x = false;
			} else {
				String[] wordarr = word1.split(" ");
				System.out.println("���� ������ " + wordarr.length);

			}

		}
	}

}
