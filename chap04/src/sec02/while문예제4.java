package sec02;

import java.util.Scanner;

public class while������4 {

	public static void main(String[] args) {
//		�������� ���� ����(1~20)�ؼ� ���߱� ���ѹݺ�
		Scanner s = new Scanner(System.in);

		int comNum = (int) (Math.random() * 20) + 1;

		while (true) {
			System.out.println("���� �ϳ��� �Է��ϼ���(1~20)");
			int userNum = s.nextInt();
			if (userNum == comNum) {
				System.out.println("�����Դϴ�.");
				break;
			} else if (userNum > comNum) {
				System.out.println("��ǻ�� ���ں��� ���� Ů�ϴ�.");
			} else {
				System.out.println("��ǻ�� ���ں��� ���� �۽��ϴ�.");
			}
		}
	}
}
