package sec02;

import java.util.Scanner;

public class Ȯ�ι���11 {

	public static void main(String[] args) {

		// ������ �����ڵ带 �Է��ϼ���. ��)ȫ�浿1234 < ����3����=id ����4����=password(���ڷ��Է�)
		// ���ڿ��� �и�

		Scanner s = new Scanner(System.in);
		System.out.println("������ �����ڵ带 �Է��ϼ���");
		String code = s.next();
		String id = code.substring(0, 3);
		int password = Integer.parseInt(code.substring(3, 7)); //(3)���� �ص���.
		System.out.println("���̵�: ");
		String name = s.next();
		System.out.println("�н�����: ");
		String pass = s.next();
		int password1 = Integer.parseInt(pass);

		if (name.equals("id")) {
			if (password == password1) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ����:�н����尡 Ʋ��");
			}

		} else {
			System.out.println("�α��� ����:���̵� �������� ����");
		}

	}

}
