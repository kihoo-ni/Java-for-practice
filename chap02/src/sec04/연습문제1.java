package sec04;

import java.util.Scanner;

public class ��������1 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���.");
		String name = s.next();
		System.out.println("���̸� �Է��ϼ���.");
		int age=s.nextInt();
		
		System.out.println("����\t�̸�\t����");
		System.out.printf("%-3d\t%s\t%3d\n",1, name, age);
		System.out.printf("%-3d, %s, %3d\n",1, name, age);
		System.out.printf("%-3d,%s,%3d\n",1, name, age);
		
		

		System.out.printf("����: %-3d, �̸�: %s, ����: %3d\n",1,"�̱���",29);
		System.out.printf("����: %-3d,�̸�: %s,����: %3d\n",1,"�̱���",29);
		System.out.printf("����: %-3d,�̸�: %s,����: %3d\n",1, "�̱���", 29);
		
		
		
		
	}


}
