package sec01;

import java.util.Scanner;

public class IfDiceExample2 {

	public static void main(String[] args) {
		// 1. ��ǻ�Ͱ� ������ ���� (1~6)
		// 2. ����ڰ� ����(1~6)
		// �μ��� ��ġ�Ұ�� �μ��� ��ġ�մϴ� ���
		// ��ǻ�� ���ڰ� ��ũ�� ��ǻ�� ���ڰ� ��Ů�ϴ� ���
		// ����� ���ڰ� ��ũ�� ����� ���ڰ� ��Ů�ϴ� ���
		int num = (int) (Math.random() * 6) + 1;
		System.out.println("��ǻ�� ������ ���Ⱚ��? " + num);
		Scanner s = new Scanner(System.in);
		System.out.println("����ڴ� 1~6�� �� �Ѱ��� ��ȣ�� �Է����ּ���");
		int num2 = s.nextInt();
		if (num == num2) {
			System.out.println("�� ���ڰ� ��ġ�մϴ�.");
		} else if (num > num2) {
			System.out.println("��ǻ�� ���ڰ� ��Ů�ϴ�.");
		} else {
			System.out.println("����� ���ڰ� ��Ů�ϴ�.");
		}
	}
}
