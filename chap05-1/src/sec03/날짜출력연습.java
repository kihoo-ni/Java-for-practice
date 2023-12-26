package sec03;

import java.util.Calendar;

public class 날짜출력연습 {

	public static void main(String[] args) {
		Calendar x = Calendar.getInstance();
		int year = x.get(Calendar.YEAR);
		int month = x.get(Calendar.MONTH) + 1;
		int day = x.get(Calendar.DAY_OF_MONTH);
		int hour = x.get(Calendar.HOUR);
		System.out.println(year + "년 " + month + "월 " + day + "일 " + hour + "시 입니다.");
	}

}
