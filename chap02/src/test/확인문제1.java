package test;

import java.util.Scanner;

public class Ȯ�ι���1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("����� �̸���?");
		String name=s.next();
		System.out.println("����� ���̴�?");
		int age=s.nextInt();
		System.out.println("����� �޴��� ��ȣ ��� 4�ڸ���?");
		String middlenumber=s.next();
		System.out.println("����� �޴��� ��ȣ �� 4�ڸ���?");
		String lastnumber=s.next();
		
		System.out.println("�̸�: "+name);
		
		System.out.print("����: "+age+"\n");
		
		System.out.printf("��ȭ: 010-%s-%s", middlenumber, lastnumber);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
