package sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarExample {

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
		boolean x = true;

		while (x) {
			System.out.println("메뉴 번호를 입력하세요");
			int i = s.nextInt();
			if (i == 1) {
				System.out.println("자동차 클래스 객체를 생성하세요");
				list.add(new Car(s.next(), s.nextInt(), s.nextInt(), s.next()));
			} else if (i == 2) {
				System.out.println("삭제하고 싶은 인덱스 번호를 입력하세요");
				list.remove(s.nextInt());
			} else if (i == 3) {
				for (int k = 0; k < list.size(); k++) {
					Car num = list.get(k);
					System.out.println(num.company + " " + num.cost + " " + num.maxSpeed + " " + num.color);
				}

			} else {
				
				x = false;
			}
		}
	}
}
