package sec02;

import java.util.Scanner;

public class �����ӱ� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("�ٷνð���?");
		int hour = s.nextInt();

		double result = (hour >= 10) ? hour * 1.2 * 9620 : hour * 9620;
		System.out.println((int) result);
	}

}
