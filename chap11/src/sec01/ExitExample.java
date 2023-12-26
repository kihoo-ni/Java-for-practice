package sec01;

public class ExitExample {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if (i == 50) {
				System.out.println("50이 나와서 중지");
				System.exit(0);
			} else if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
