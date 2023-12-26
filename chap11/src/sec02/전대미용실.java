package sec02;

import java.util.Calendar;
import java.util.Scanner;

public class 전대미용실 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("성함이?");
		String name = s.next();
		System.out.println("어떻게 해드릴까요?");
		System.out.println("커트(8000원), 파마(20000원), 염색(25000원), 매직(60000원)");
		String menu = s.next();
		int price = 0;
		switch (menu) {
		case "커트":
			price = 8000;
			break;
		case "파마":
			price = 20000;
			break;
		case "염색":
			price = 25000;
			break;
		case "매직":
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

		System.out.println(name + "님의 결제금액은 " + price + "입니다.");
	}

}
