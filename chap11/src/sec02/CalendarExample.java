package sec02;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); // 추상클래스라 new 연산자를 사용해서 인스턴스 생성 불가임.
		

		int hour = now.get(Calendar.HOUR);
		System.out.println("현재시각: " + hour);

		int ampm = now.get(Calendar.AM_PM);
		System.out.println(ampm);
	}

}
