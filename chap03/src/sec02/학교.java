package sec02;

import java.util.Scanner;

public class �б� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�л�����?");
		int student=s.nextInt();
		System.out.println("���ʰ�����?");
		int pencil=s.nextInt();
		
		int studentp=pencil/student;
		int remain=pencil%student;
		
		System.out.printf("�л� �� ��� %d���� ������ �������� %d���� ���ƿ�.\n", studentp, remain);
		System.out.println("�л� �� ��� "+studentp+"���� ������ �������� "+remain+"���� ���ƿ�.");
		
		
		
	}

}
