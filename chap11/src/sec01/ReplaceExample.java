package sec01;

import java.util.Scanner;

public class ReplaceExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�ּҸ� �Է��ϼ���");
		String address = s.nextLine();
		String newAddress = address.replace("����", "���ֱ�����");
		System.out.println(address);
		System.out.println(newAddress);
		
	}

}
