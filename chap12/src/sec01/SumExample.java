package sec01;

public class SumExample {

	public static void main(String[] args) {
		Runnable sum = new Sum();
		Thread thread = new Thread(sum);
		thread.start();

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				try {
					Thread.sleep(600);
				} catch (Exception e) {
				}
				System.out.println(i);
			}
		}

	}

}
