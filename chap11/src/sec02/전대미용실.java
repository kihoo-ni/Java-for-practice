package sec02;

import java.util.Calendar;
import java.util.Scanner;

public class ����̿�� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������?");
		String name = s.next();
		System.out.println("��� �ص帱���?");
		System.out.println("ĿƮ(8000��), �ĸ�(20000��), ����(25000��), ����(60000��)");
		String menu = s.next();
		int price = 0;
		switch (menu) {
		case "ĿƮ":
			price = 8000;
			break;
		case "�ĸ�":
			price = 20000;
			break;
		case "����":
			price = 25000;
			break;
		case "����":
			price = 60000;
			break;
		}
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR);
		int ampm = now.get(Calendar.AM_PM);

		if (hour < 12 && ampm == 0) {
			price *= 0.7;
		} else if (hour < 6 && ampm == 1) {
			price *= 0.9;
		}

		System.out.println(name + "���� �����ݾ��� " + price + "�Դϴ�.");
	}

}
