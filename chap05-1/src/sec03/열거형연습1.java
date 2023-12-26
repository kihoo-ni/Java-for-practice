package sec03;

import java.util.Calendar;

public class 열거형연습1 {

	public static void main(String[] args) {
		Part month = null;
		Calendar x = Calendar.getInstance();
		int quater = x.get(Calendar.MONTH) + 1;
		
		switch (quater) {
		case 1:
		case 2:
		case 3:
			month = Part.일사분기;
			break;
		case 4:
		case 5:
		case 6:
			month = Part.이사분기;
			break;
		case 7:
		case 8:
		case 9:
			month = Part.삼사분기;
			break;
		default:
			month = Part.사사분기;
		}
		System.out.println("이번 분기는 " + month + "입니다.");
	}

}
