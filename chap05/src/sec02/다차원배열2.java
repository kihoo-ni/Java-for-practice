package sec02;

import java.util.Scanner;

public class �������迭2 {

	public static void main(String[] args) {
		// �ݺ����� �̿��Ͽ� 3���� �̸��� �Է¹�������. (�迭�� �Է¹ޱ�)
		// int[][]num=new int[3][2]; 3�� 2ĭ ¥�� �迭����
		// ù��°ĭ�� �߰���� �ι�°ĭ�� �⸻��� ����
		// ����ڷκ��� ���������� �ݺ����� �̿��Ͽ� �Է¹�������.
		// 3���� ��������� �������� ����ϼ���
		Scanner s = new Scanner(System.in);
		String[] person = new String[3];
		for (int i = 0; i < person.length; i++) {
			System.out.println((i + 1) + "��° ��� �̸��� �Է��ϼ���.");
			person[i] = s.next();
		}

		int[][] num = new int[3][2];
		for (int i = 0; i < num.length; i++) {
			int sum = 0;
			for (int k = 0; k < num[i].length; k++) {
				if (k == 0) {
					System.out.println(person[i] + "�� �߰�������?");
				} else {
					System.out.println(person[i] + "�� �⸻������?");
				}
				num[i][k] = s.nextInt();
				sum += num[i][k];
			}
			double avg = (double) sum / 2;
			System.out.println(person[i] + "�� ��������� : " + avg + "�Դϴ�.");
			System.out.println();

		}

	}
}
