package sec02;

import java.util.Scanner;

public class ���輺�� {

	public static void main(String[] args) {
		// ��й�ȣ�� ���� �ҹ��ڿ� ������ ���� a5, b7
		// ����ڰ� ��й�ȣ�� ����� �Է������� ȯ���մϴ�. ���
		// ����ڰ� ��й�ȣ�� Ʋ���� ��й�ȣ�� ���� �ҹ��ڿ� ������ �����Դϴ�. ���
		// �߰���簡 80�� �̻��̰ų� �⸻��簡 80�� �̻��̸� "���"�ƴϸ� "Ż��"

		Scanner s = new Scanner(System.in);
		System.out.println("����� �̸���?");
		String name = s.next();
		System.out.println("���� ��й�ȣ�� �Է��� �ּ���.");
		String pass = s.next();

		// char x=pass.charAt(0)
		// char y=pass.charAt(1) �� ���� �����ϸ� ������ Ǯ �� ����.
		// if ( (x>=97)&&(x<=122) &&(y>=48)&&(y<=57)

		if (((pass.charAt(0) >= 97) && (pass.charAt(0) <= 122)) && ((pass.charAt(1) >= 48) && (pass.charAt(1) <= 57))) {
			System.out.println(name + "�� ȯ���մϴ�.");
		} else {
			System.out.println("��й�ȣ�� ���� �ҹ��ڿ� ������ �����Դϴ�.");
		}
	
		System.out.println("�߰���� ������ �Է��ϼ���.");
		int mid=s.nextInt();
		System.out.println("�⸻��� ������ �Է��ϼ���.");
		int last=s.nextInt();
		
		if(mid>=80 || last>=80 ) {
			System.out.println("���");
		}else {
			System.out.println("Ż��");
		}
		
	}
}
