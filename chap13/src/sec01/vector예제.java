package sec01;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class vector���� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		List<Integer> list = new Vector<Integer>();

		boolean x = true;
		int num;
		while (x) {
			System.out.println("���� ������ �Է��� �ּ��� ���� ������ �Է��ϸ� �ߴ��մϴ�.");
			num = s.nextInt();
			
			if (num >= 0) {
				list.add(num);
			} else {
				System.out.println("���� ������ �ƴմϴ�.");
				x = false;
			}
		}

		int max = list.get(0);

		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		System.out.println("�ִ��� " + max + "�Դϴ�.");

	}

}
