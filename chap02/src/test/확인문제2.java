package test;

import java.util.Scanner;

public class Ȯ�ι���2 {

	public static void main(String[] args) {
		// �μ��� �Է�
		// ù��° ���� �ι�° ������ ũ�� ���� ���� (if���� �߰�)
		// ù���� ���� �ι�° ������ ������ ���� ����
		// ��) 5,3 5-3=2 ���� ��� :2
		// ��) 3,5 3+5=8 ���� ��� :8
		
		Scanner s=new Scanner(System.in);
		System.out.println("ù ��° ���� �Է��ϼ���");
		String num1=s.next();
		System.out.println("�� ��° ���� �Է��ϼ���");
		String num2=s.next();
		
		int a=Integer.parseInt(num1);
		int b=Integer.parseInt(num2);
		int result;
		
		
		if(a>b) {
			result=a-b;
			System.out.println("���� ��� : "+result);
		} else {
			result=a+b;
			System.out.println("���� ��� : "+result);
		
			
		
		
		
		
		
	}
	}
}
