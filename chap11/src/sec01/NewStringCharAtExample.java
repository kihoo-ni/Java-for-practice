package sec01;

import java.util.Scanner;

public class NewStringCharAtExample {

	public static void main(String[] args) {
		// 2명의 이름과 처리코드를 입력받으세요.
		// 예) 홍길동 C88, 장동건 B70
		// 맨 앞 문자는 등급, 나머지 2글자는 점수입니다.
		// 등급은 A~D등급까지 존재함.
		// A등급은 점수에 20% 가산
		// B등급은 점수에 10% 가산
		// C등급은 점수에 5% 가산
		// 최종점수가 90점 이상이면 "최우수", 80점 이상이면 "우수"
		// 나머지는 "일반"
		// 최종 출력 "홍길동님은 최우수 등급입니다."

		Scanner s = new Scanner(System.in);
		String[] name = new String[2]; // 이름 저장 배열
		String[] grade = new String[2]; // 최종등급을 저장하는 배열
		int[] point = new int[2]; // 점수를 저장하는 배열
		char[] code = new char[2]; // 코드 맨 앞자리(A,B,C) 저장하는 배열

		String processCode; // 전체 코드 저장(EX) B88)
		int processPoint; // 입력점수 (코드뒤 2자리)

		for (int i = 0; i < 2; i++) {
			System.out.println("이름과 처리코드를 입력해 주세요");
			name[i] = s.next();
			processCode = s.next();
			code[i] = processCode.charAt(0); // 전체 코드에서 A,B,C 분리
			processPoint = Integer.parseInt(processCode.substring(1));
			// 전체코드에서 뒤 2자리 숫자 분리

			switch (code[i]) {
			case 'A':
				point[i] = (int) (processPoint * 1.2);
				break;
			case 'B':
				point[i] = (int) (processPoint * 1.1);
				break;
			case 'C':
				point[i] = (int) (processPoint * 1.05);
				break;
			default:
				point[i] = processPoint;
				break;
			}
			if (point[i] >= 90) {
				grade[i] = "최우수";
			} else if (point[i] >= 80) {
				grade[i] = "우수";
			} else {
				grade[i] = "일반";
			}
		}
		for (int j = 0; j < 2; j++) {
			System.out.println(name[j] + "님은" + grade[j] + "등급입니다.");
		}

	}

}
