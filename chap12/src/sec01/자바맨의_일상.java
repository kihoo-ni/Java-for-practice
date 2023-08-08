package sec01;

import java.util.Calendar;

public class 자바맨의_일상 {

	public static void main(String[] args) {
		try {Thread.sleep(1000);} catch (Exception e) {}
		System.out.println("자바맨의 일상");
		try {Thread.sleep(1000);} catch (Exception e) {}

		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);

		try {Thread.sleep(1000);} catch (Exception e) {}
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 입니다.");

		Runnable wake = new WakeUp();
		Thread t1 = new Thread(wake);
		t1.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {Thread.sleep(2000);} catch (Exception e) {}
				System.out.println("공부 합니다.");
			}
		});
		t2.start();
		Thread t3 = new Sleep();
		t3.start();

		try {Thread.sleep(4000);} catch (Exception e) {}
		System.out.println("오늘은 " + year + "년 " + month + "월 " + (day + 1) + "일 입니다.");
		Thread t4 = new Thread(wake);
		t4.start();
		
		Thread t5 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {Thread.sleep(2000);} catch (Exception e) {}
				System.out.println("공부 합니다.");
			}
		});
		t5.start();
		
		Thread t6 = new Sleep();
		t6.start();
		
	}

}
