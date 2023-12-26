package sec04;

import java.util.Scanner;

public class TravelExample {

	public static void main(String[] args) {
		Travel tr = new Travel();
		tr.setOil(20);
		tr.setLocation("광주");

		Scanner s = new Scanner(System.in);
		
		
		while(tr.isOilLeft()) {
			System.out.println("여행할 지역명은?");
			String local=s.next();
			if(local.equals("서울")) {
				tr.oilMinus(10);
				tr.setLocation("서울");
				System.out.println("현재 위치는 : "+tr.getLocation());
			} else if(local.equals("부산")) {
				tr.oilMinus(5);
				tr.setLocation("부산");
				System.out.println("현재 위치는 : "+tr.getLocation());
			} else {
				tr.oilMinus(2);
				tr.setLocation("화순");
				System.out.println("현재 위치는 : "+tr.getLocation());

			}
		}
	}

}
