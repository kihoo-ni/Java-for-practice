package sec02;

import java.util.Scanner;

public class for예제10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("구구단 몇단?");
		int kkd = s.nextInt();
		System.out.println("구구단 " + kkd + "단");
		for (int i = 1; i <= 9; i++) {
			int multi = kkd * i;
			System.out.println(kkd + "*" + i + "=" + multi);
		}
	}

}
