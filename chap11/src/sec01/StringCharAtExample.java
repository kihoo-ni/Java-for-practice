package sec01;

import java.util.Scanner;

public class StringCharAtExample {

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
		String[] name = new String[2];
		String[] code = new String[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("이름을 입력하세요");
			name[i] = s.next();
			System.out.println("처리코드를 입력하세요");
			code[i] = s.next();
			char codeGrade = code[i].charAt(0);
			char codeScore = code[i].charAt(1);
			String score2 = code[i].substring(1);
			int score1 = Integer.parseInt(score2);
			String grade;
			String codeEv;
			double scorePlus;
			switch (codeGrade) {
			case 'A':
				scorePlus = score1 * 1.2;
				break;
			case 'B':
				scorePlus = score1 * 1.1;
				break;
			default:
				scorePlus = score1 * 1.05;
				break;
			}
			switch (codeScore) {
			case '9':
				codeEv = "최우수";
				break;
			case '8':
				codeEv = "우수";
				break;
			default:
				codeEv = "일반";
				break;
			}

			System.out.println(name[i] + "님은 " + codeEv + "등급입니다.");
			System.out.println("");
		}
	}

}
