package sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList���� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Character> list = new ArrayList<Character>();

		System.out.println("������ �Է��ϼ���. (A~F���� ����)");
		System.out.println("ABCDEF �� �����ؼ� ��ĭ ���� �Է�");
		for (int i = 0; i < 6; i++) {
			char grade = s.next().charAt(0); //nextLine���� ���پ� �Է�  �׳� next�� ��ĭ�� ���� �Է�
			list.add(grade);
		}
		double sum = 0.0;
		double average = 0.0;

		for (int i = 0; i < list.size(); i++) {
			switch (list.get(i)) {
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;
			case 'D':
				sum += 1.0;
				break;
			case 'F':
				break;
			}
		}
		average = sum / 6;
		System.out.println("��������� " + average + "�Դϴ�.");
	}

}
