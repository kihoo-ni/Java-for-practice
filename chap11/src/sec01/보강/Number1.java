package sec01.����;

import java.util.Calendar;

public class Number1 {

	public static void main(String[] args) {
		Calendar today=Calendar.getInstance();
		int hour=today.get(Calendar.HOUR_OF_DAY);
		int minute=today.get(Calendar.MINUTE);
		
		if(hour>=4 && hour<=12) {
			System.out.println("���� �ð��� "+hour+"�� "+minute+"�� �Դϴ�.");
			System.out.println("Good Morning");
		} else if(hour>12 && hour<=18){
			System.out.println("���� �ð��� "+hour+"�� "+minute+"�� �Դϴ�.");
			System.out.println("Good Afternoon");
		} else if(hour>18 && hour<=22) {
			System.out.println("���� �ð��� "+hour+"�� "+minute+"�� �Դϴ�.");
			System.out.println("Good Evening");
		} else {
			System.out.println("���� �ð��� "+hour+"�� "+minute+"�� �Դϴ�.");
			System.out.println("Good Night");
		}
	}

}
