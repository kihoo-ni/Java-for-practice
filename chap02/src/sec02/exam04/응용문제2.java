package sec02.exam04;

import java.util.Scanner;

public class ���빮��2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("�� �� ���ڸ� �Է��ϼ���.");
		System.out.println("ù ��° ���ڴ� �����ΰ���?");
		int a = s.nextInt();
		System.out.println("�� ��° ���ڴ� �����ΰ���?");
		int b = s.nextInt();

		int div = a / b; 
		//int sum =a + b; 
		// System.out.println("�Է��Ͻ� �� ���� ���� :" + sum + "�Դϴ�.");
		System.out.println("�Է��Ͻ� �� ���� ���� �����: " + div + " �Դϴ�.");

	}

}
