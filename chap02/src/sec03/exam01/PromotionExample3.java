package sec03.exam01;

import java.util.Scanner;

public class PromotionExample3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("����б��� �Է��ϼ���.");

		String a = s.next();

		char b = a.charAt(2); //charAt(����) : ���ڿ����� �ش� ���� ��ġ�� �ش��ϴ� ���ڿ��� char Ÿ������ ��ȯ
							 // toString(������) : �����͸� String Ÿ������ ��ȯ
		if(b=='��') {	
		System.out.println("����� ���л��Դϴ�.");
	} else {
		System.out.println("����� ����л��Դϴ�.");
	}
	}
}
