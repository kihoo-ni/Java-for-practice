package sec04;

import java.util.Scanner;

public class TravelExample {

	public static void main(String[] args) {
		Travel tr = new Travel();
		tr.setOil(20);
		tr.setLocation("����");

		Scanner s = new Scanner(System.in);
		
		
		while(tr.isOilLeft()) {
			System.out.println("������ ��������?");
			String local=s.next();
			if(local.equals("����")) {
				tr.oilMinus(10);
				tr.setLocation("����");
				System.out.println("���� ��ġ�� : "+tr.getLocation());
			} else if(local.equals("�λ�")) {
				tr.oilMinus(5);
				tr.setLocation("�λ�");
				System.out.println("���� ��ġ�� : "+tr.getLocation());
			} else {
				tr.oilMinus(2);
				tr.setLocation("ȭ��");
				System.out.println("���� ��ġ�� : "+tr.getLocation());

			}
		}
	}

}
