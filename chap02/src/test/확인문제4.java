package test;

import java.util.Scanner;

public class Ȯ�ι���4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("[�ʼ� ���� �Է�]");
		System.out.print("1. �̸�: ");
		String name=s.next();
		System.out.print("2. �ֹι�ȣ �� 6�ڸ�: ");
		String number=s.next();
		System.out.print("3. ��ȭ��ȣ: ");
		String phone=s.next();
		
		System.out.printf("%s�� �ֹι�ȣ�� %s�̰� ����ó�� %s�Դϴ�.", name, number, phone);
	}

}
