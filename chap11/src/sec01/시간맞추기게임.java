package sec01;

import java.util.Calendar;
import java.util.Scanner;

public class �ð����߱���� {
	private String enter;
	private int time;

	public int start() {
		Scanner s = new Scanner(System.in);
		enter = s.nextLine();
		Calendar now = Calendar.getInstance();
		time = now.get(Calendar.SECOND);
		System.out.println("");
		System.out.println("���� ���� �ð� : " + time + "�� �Դϴ�.");
		System.out.println("");
		return time;
	}

	public static void main(String[] args) {
		System.out.println("10�ʿ� ����� ����� �̱�� ����");
		System.out.println("");
		�ð����߱���� enter = new �ð����߱����();

		String names[] = { "ȫ�浿", "�嵿��" }; // 2�� �迭 ����
		int time1, time2; // ���� �ð�(��)�� ���ð�(��) ������ ����
		int times[] = new int[2]; // 2���� ���� �ð�(�� �ð�-���� �ð�)������ �迭 ����

		// 2�� �ݺ��Ͽ� ���� �ð� �����͸� �迭�� ����
		for (int i = 0; i < 2; i++) {
			System.out.println(names[i] + " ���� <Enter>Ű >>");
			time1 = enter.start();
			System.out.println(names[i] + " 10�� ���� �� <Enter>Ű >>");
			time2 = enter.start();
			if (time1 > time2) {
				times[i] = (time2 + 60) - time1;
			} else {
				times[i] = time2 - time1;
			}
		}

		if (times[0] > times[1] || times[1] > 10 ) {
			System.out.println("ȫ�浿�� ��� " + times[0] + ", " + "�嵿���� ��� " + times[1] + ", ���ڴ� ȫ�浿");
		} else {
			System.out.println("ȫ�浿�� ��� " + times[0] + ", " + "�嵿���� ��� " + times[1] + ", ���ڴ� �嵿��");
		}

	}

}
