package sec02;

public class for예제2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i += 2) {
			sum = sum + i;

		}
		System.out.println("1~10까지의 홀수의 합: " + sum);
	}

}
