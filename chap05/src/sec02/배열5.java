package sec02;

import java.util.Scanner;

public class �迭5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�迭 ������ �˷��ּ���");
		int arraynum = s.nextInt();

		int[] num1 = new int[arraynum];
		// ����ڰ� �Է��� ���ڷ� �迭 ���� ����
		// for ���� �̿��Ͽ� �迭�� ���ڸ� 1���� ����ڰ� �Է��� ���ڸ�ŭ ������ �߰�
		// �Էµ� �������� ��հ� ���
		for (int i = 0; i < arraynum; i++) {
			num1[i] = i + 1;
		}
		int sum = 0;
		for (int j = 0; j < arraynum; j++) {
			sum += num1[j];
		}
		double avg = (double) sum / arraynum;
		System.out.println("��հ��� : " + avg + "�Դϴ�.");
	}

}
