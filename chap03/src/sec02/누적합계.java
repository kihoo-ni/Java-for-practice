package sec02;

import java.util.Scanner;

public class �����հ� {

	public static void main(String[] args) {
		// ù��° ���ڰ� 5, �ι�° ���ڰ� 8, 5+6+7+8�� ����� ���
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��ϼ���(1~20����)");
		int a = s.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���(1~20����)");
		int b = s.nextInt();
		int result = 0;

		while (true) {
			if (a <= b) {
				result += a; // result ���� 0���� �����ؼ� �ݺ��ؼ� ���ϰ� ����. result =result+a++;
				a++;
			} else {
				break;
			}
		}
		System.out.println("�� ���� ���� �հ�� : " + result);
	}

}
