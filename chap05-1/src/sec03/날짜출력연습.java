package sec03;

import java.util.Calendar;

public class ��¥��¿��� {

	public static void main(String[] args) {
		Calendar x = Calendar.getInstance();
		int year = x.get(Calendar.YEAR);
		int month = x.get(Calendar.MONTH) + 1;
		int day = x.get(Calendar.DAY_OF_MONTH);
		int hour = x.get(Calendar.HOUR);
		System.out.println(year + "�� " + month + "�� " + day + "�� " + hour + "�� �Դϴ�.");
	}

}
