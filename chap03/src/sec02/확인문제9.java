package sec02;

import java.util.Scanner;

public class Ȯ�ι���9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է��ϼ���");
		String x = s.next();
		double a = Double.parseDouble(x);
		System.out.println("�� ��° ���� �Է��ϼ���");
		String y = s.next();
		double b = Double.parseDouble(y); // double b=Double.parseDouble(s.next());
		double result = a / b;

		if (b == 0.0) {
			System.out.println("���: ���Ѵ�");
		} else { // b !=0.0 �������� �ݴ�� Ǯ���� ����.
			System.out.println("���: " + result);
		}
		
	}

}
