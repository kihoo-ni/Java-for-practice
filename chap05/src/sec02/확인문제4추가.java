package sec02;

import java.util.Scanner;

public class Ȯ�ι���4�߰� {

	public static void main(String[] args) {
		// ����ڷκ��� �迭������ �Է¹�������
		// �迭���� ��ŭ ���ڸ� �Է¹޾Ƽ� �迭�� �����ϼ���. �ش�迭���� �������� ���ڸ� ����ϼ��� (���ڴ� ����� ������)

		Scanner s = new Scanner(System.in);
		System.out.println("�迭 ������ �Է��ϼ���.");
		int x = s.nextInt();
		int[] y = new int[x];

		for (int i = 0; i < y.length; i++) {
			System.out.println((i + 1) + "��° �迭 ���ڸ� �Է��ϼ���");
			y[i] = s.nextInt();
		}
		int min = y[0];
		for (int k = 0; k < y.length; k++) {
			if (min > y[k]) {
				min = y[k];
			}
		}
		System.out.println("�ּڰ��� : " + min);

	}

}
