package sec02;

import java.util.Scanner;

public class for����10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������ ���?");
		int kkd = s.nextInt();
		System.out.println("������ " + kkd + "��");
		for (int i = 1; i <= 9; i++) {
			int multi = kkd * i;
			System.out.println(kkd + "*" + i + "=" + multi);
		}
	}

}
