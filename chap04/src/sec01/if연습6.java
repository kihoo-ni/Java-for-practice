package sec01;

import java.util.Scanner;

public class if����6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���ڴ�?");
		int num1 = s.nextInt();
		System.out.println("�ι�° ���ڴ�?");
		int num2 = s.nextInt();
		// ù��° ���ڰ� �ι�° ���ں��� ũ�� ù��° ���ڰ� Ů�ϴ� ���
		// ù��° ���ڰ� �ι�° ���ں��� ������ �ι�° ���ڰ� Ů�ϴ� ���
		// ù��° ���ڰ� �ι�° ���ڿ� ������ �� ���ڰ� �����ϴ� ���
		if (num1 > num2) {
			System.out.println("ù��° ���ڰ� Ů�ϴ�.");
		}
		if (num1 < num2) {
			System.out.println("�ι�° ���ڰ� Ů�ϴ�.");
		}
		if (num1 == num2) {
			System.out.println("�� ���ڰ� �����ϴ�.");
		}
	}

}
