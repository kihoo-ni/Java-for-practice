package sec03.exam01;

import java.util.Scanner;

public class PromotionExample2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("�� ���ڸ� �Է��ϼ���.");

		String a = s.next();
		char b = a.charAt(0); //charAt(����) : ���ڿ����� �ش� ���� ��ġ�� �ش��ϴ� ���ڿ��� char Ÿ������ ��ȯ
							 // toString(������) : �����͸� String Ÿ������ ��ȯ
		int c = b;

		System.out.println("�Է��Ͻ�" + a + "�� �����ڵ�� " + c + "�Դϴ�.");

		
	}

}
