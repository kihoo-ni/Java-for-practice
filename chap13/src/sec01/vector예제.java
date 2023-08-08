package sec01;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class vector예제 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		List<Integer> list = new Vector<Integer>();

		boolean x = true;
		int num;
		while (x) {
			System.out.println("양의 정수를 입력해 주세요 음의 정수를 입력하면 중단합니다.");
			num = s.nextInt();
			
			if (num >= 0) {
				list.add(num);
			} else {
				System.out.println("양의 정수가 아닙니다.");
				x = false;
			}
		}

		int max = list.get(0);

		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		System.out.println("최댓값은 " + max + "입니다.");

	}

}
