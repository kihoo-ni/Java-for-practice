package sec02;

import java.util.Scanner;

public class Ȯ�ι���7���繮�� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean x = true;
		int sum = 0;
		int sum1 = 0;
		while (x) {
			System.out.println("���ֽø������� �湮�� ȯ���մϴ�.");
			System.out.println("�۾��ڵ�� ������ �Է����ּ���.");
			System.out.println("(A�� ����, B�� �ݳ�, C�� �����Դϴ�.)");
			String code = s.next();
			String code1 = code.substring(0, 1);
			String code2 = code.substring(1);
			int book1 = Integer.parseInt(code2);

			switch (code1) {
			case "A":
				System.out.println("å " + code2 + "�� ����");
				System.out.println();

				sum = sum += book1;
				break;
			case "B":
				System.out.println("å " + code2 + "�� �ݳ�");
				System.out.println();
				sum1 = sum1 += book1;
				break;
			default:
				System.out.println("å " + code2 + "�� ����");
				System.out.println();
				x = false;
			}

			System.out.println("�� ����Ǽ�: " + sum + "�� �ݳ��Ǽ�: " + sum1);
			System.out.println();
		}
	}

}
