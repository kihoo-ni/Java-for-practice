package sec01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap연습1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("나라와 인구수를 입력하세요 (총 세번)");
		for (int i = 0; i < 3; i++) {
			map.put(s.next(), s.nextInt());
		}

		while (true) {
			System.out.println();
			System.out.println("나라 이름을 입력해주세요");
			String country = s.next();
			if (country.equals("그만")) {
				System.out.println("검색을 종료합니다.");
				break;
			}

			if (map.containsKey(country)) {
				System.out.println("해당 나라의 인구수는 " + map.get(country));

			} else {
				System.out.println("해당나라는 없습니다");
			}

		}

	}
}
