package sec01;

import java.util.Scanner;

public class ����켱����2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���� �ϳ��� �Է��ϼ���");
		int num1 = s.nextInt();
		System.out.println("�ι�° ���� �ϳ��� �Է��ϼ���");
		int num2 = s.nextInt();

		// ���� �����ڸ� ����Ͽ� �� ���� ���� 50�̻��̸� "���"
		// 50�̸��̸� "Ż��"�� ����Ͻÿ�

		int sum = num1 + num2;
		String result = (sum >= 50) ? "���" : "Ż��";
		System.out.println(result);
	}

}
