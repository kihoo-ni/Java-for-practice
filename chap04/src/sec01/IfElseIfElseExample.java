package sec01;

import java.util.Scanner;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		// 7000원짜리 음료선물세트를 구입했을 때 지불해야하는 금액은?
		// 단, 8개 이상 구매 시에는 10% 할인이 됨. if-else문 사용.
		Scanner s = new Scanner(System.in);
		System.out.println("음료선물세트는 몇개를 구입했는가?");
		int drink = s.nextInt();
		double result;
		if (drink >= 8) {
			result = drink * 7000 * 0.9; // result=drink*6300; << 10% 할인 된값으로 변환할수있음.
			System.out.println("가격은 " + (int) result + "입니다.");
		} else {
			result = drink * 7000;
			System.out.println("가격은 " + (int) result + "입니다.");
		}
	}

}
