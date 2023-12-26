package sec02;

import java.util.Scanner;

public class 배열복사3 {

	public static void main(String[] args) {
		// 사용자에게 3명의 이름을 입력받아 배열에 저장하세요
		// String 타입의 5개짜리 배열을 별도로 생성하세요
		// 첫번째 배열에서 두번째 배열로 값을 복사하세요
		// 예) 두번째 배열에 철수,영희,순희,null,null
		// 두번째 배열의 null 값을 영수로 채우세요
		Scanner s = new Scanner(System.in);
		String[] name = new String[3];
		for (int i = 0; i < name.length; i++) {
			System.out.println("이름을 입력하세요");
			name[i] = s.next();
		}
		String[] name1 = new String[5];

		System.arraycopy(name, 0, name1, 0, name.length);

		for (int i = 0; i < name1.length; i++) {
			if (i >= (name1.length - 2)) { // if(i>=3){ name1[i]="영수";} system.out.print(name1[i]+",");로 수정하면 훨씬 쉽게함.
				name1[i] = "영수";
				System.out.print(name1[i] + ", ");
			} else {
				System.out.print(name1[i] + ", ");
			}
		}

	}
}
