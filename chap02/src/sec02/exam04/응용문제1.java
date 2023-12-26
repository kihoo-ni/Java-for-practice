package sec02.exam04;

public class 응용문제1 {

	public static void main(String[] args) {

		System.out.println("1" + "2"); // 문자열 string
		System.out.println(true + ""); // boolean + 문자열 string = 문자열로 통일
		System.out.println('A' + 'B');
		System.out.println('1' + 2); // 캐릭터 + int = int로 통일
		System.out.println('1' + '2');
		// System.out.println('J' + 'ava'); //ava 3글자 집어넣을수 없음
		System.out.println('J' + "ava"); // J 캐릭터 + ava 문자열(string) = 문자열로통일
		// System.out.println(true + null);

		System.out.println(1 + "ava"); // int+string =그냥나옴
		char var = 65;
		System.out.println("var:" + var);

		
	}

}
