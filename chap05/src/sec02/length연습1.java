package sec02;

import java.util.Scanner;

public class length����1 {

	public static void main(String[] args) {
//		�迭�� ������? (scanner�� ���� �Է¹���)
//		�Է¹��� ������ �迭�� �����ϼ���. �ݺ������� ������ �迭�� ���ڸ� �־��ּ���.
//		�ش� ���ڵ��� �հ�� ����� ����ϼ���.
		Scanner s = new Scanner(System.in);
		System.out.println("�迭�� ������?");
		int num = s.nextInt();
		int[] scores = new int[num]; // �Է¹��� ���ڷ� �迭���� ����

		for (int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "��° ���ڸ� �Է��ϼ���.");
			int num1 = s.nextInt();
			scores[i] = num1;
		}
		int sum = 0;
		for (int j = 0; j < scores.length; j++) {
			sum += scores[j];
		}
		System.out.println("���� : " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("��� : " + avg);
		
	}

}
