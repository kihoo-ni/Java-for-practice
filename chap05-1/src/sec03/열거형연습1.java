package sec03;

import java.util.Calendar;

public class ����������1 {

	public static void main(String[] args) {
		Part month = null;
		Calendar x = Calendar.getInstance();
		int quater = x.get(Calendar.MONTH) + 1;
		
		switch (quater) {
		case 1:
		case 2:
		case 3:
			month = Part.�ϻ�б�;
			break;
		case 4:
		case 5:
		case 6:
			month = Part.�̻�б�;
			break;
		case 7:
		case 8:
		case 9:
			month = Part.���б�;
			break;
		default:
			month = Part.���б�;
		}
		System.out.println("�̹� �б�� " + month + "�Դϴ�.");
	}

}
