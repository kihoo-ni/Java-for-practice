package sec01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap����1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("����� �α����� �Է��ϼ��� (�� ����)");
		for (int i = 0; i < 3; i++) {
			map.put(s.next(), s.nextInt());
		}

		while (true) {
			System.out.println();
			System.out.println("���� �̸��� �Է����ּ���");
			String country = s.next();
			if (country.equals("�׸�")) {
				System.out.println("�˻��� �����մϴ�.");
				break;
			}

			if (map.containsKey(country)) {
				System.out.println("�ش� ������ �α����� " + map.get(country));

			} else {
				System.out.println("�ش糪��� �����ϴ�");
			}

		}

	}
}
