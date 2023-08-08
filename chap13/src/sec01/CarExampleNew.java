package sec01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CarExampleNew {

	public static void main(String[] args) {

		List<Car> list = new ArrayList<>();

		// 1 데이터 추가
		// 사용자로부터 데이터를 입력받아 자동차 클래스 객체를 생성
		// 리스트에 추가하세요

		// 2 데이터 삭제
		// 사용자로부터 인덱스 번호를 입력받아 리스트 데이터를 삭제하세요

		// 3 데이터 출력
		// 입력된 리스트 데이터를 모두 출력합니다.

		// 4 종료
		Scanner s = new Scanner(System.in);
		boolean start = true;

		while (start) {
			System.out.println("메뉴 번호를 입력하세요");
			System.out.println("추가는 1, 삭제는 2, 출력은 3, 종료는 4");
			int choice = 0;
			try {
				choice = s.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다.");
				return;
			}

			switch (choice) {
			case 1:
				System.out.println("차량 제조회사는?");
				String company = s.next();
				System.out.println("차량 가격은?");
				int cost = s.nextInt();
				System.out.println("차량 최고속도는?");
				int maxSpeed = s.nextInt();
				System.out.println("차량 색상은?");
				String color = s.next();
				list.add(new Car(company, cost, maxSpeed, color));
				break;

			case 2:
				System.out.println("삭제할 데이터의 인덱스 번호를 입력하세요");
				int num = s.nextInt();
				list.remove(num);
				break;

			case 3:
				for (int k = 0; k < list.size(); k++) {
					Car field = list.get(k);
					System.out.println(field.company + " " + field.cost + " " + field.maxSpeed + " " + field.color);
				}
				break;

			case 4:
				start = false;
				break;
			}
		}
	}
}
