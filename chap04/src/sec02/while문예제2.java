package sec02;

public class while문예제2 {

	public static void main(String[] args) {
		// 구구단 5단 출력
		int i = 1;

		System.out.println("구구단 5단");
		while (i <= 9) {
			int multi = 5 * i;
			System.out.println(5+"*"+i+"="+multi);
			i++;
		}
	}

}
