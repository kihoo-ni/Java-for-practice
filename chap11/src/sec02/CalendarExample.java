package sec02;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); // �߻�Ŭ������ new �����ڸ� ����ؼ� �ν��Ͻ� ���� �Ұ���.
		

		int hour = now.get(Calendar.HOUR);
		System.out.println("����ð�: " + hour);

		int ampm = now.get(Calendar.AM_PM);
		System.out.println(ampm);
	}

}
