package sec01.����;

import java.util.Scanner;

public class Number3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ, ����, �ѱ� ��� ����");
		String literal = s.nextLine();
		for (int i = 1; i <= literal.length(); i++) {
			System.out.print(literal.substring(i));
			System.out.println(literal.substring(0, i));
		}

	}
}
