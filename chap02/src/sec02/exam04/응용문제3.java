package sec02.exam04;

import java.util.Scanner;

public class ���빮��3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("�� ���� ���̰� 5m�϶�, �ǹ��� ���̿� �ִ� ���� �ο���?");
		System.out.println("�ǹ��� ������ �����ΰ�?");
		int a = s.nextInt();

		int multi = a*5; 
		System.out.println("�ǹ��� ��ü ���̴� " + multi + "m�Դϴ�.");
		
		System.out.println("�ǹ��� ��ü ���̸� �Է��Ͻÿ�");
		int b = s.nextInt();
		System.out.println("�ǹ��ִ�����ο��� ����ΰ�?");
		
		int div = b/3; 
		System.out.println("�ǹ��� �ִ�����ο��� " + div + "���Դϴ�.");
	}

}
