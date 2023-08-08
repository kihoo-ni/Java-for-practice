package sec01;

public class SumExample2 {

	public static void main(String[] args) {
		// Runnable sum1 = new Sum();
		// Thread sum = new Thread(sum1); 익명객체 생성은 해당 과정을 생략함.
		Thread sum = new Thread(new Runnable() { // Runnable 변수 =new Runnable (){} 라고 생각하면됨.

			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					if (i % 2 == 1) {
						try {
							Thread.sleep(500);
						} catch (Exception e) {
						}
						System.out.println(i);

					}
				}
			}

		});
		sum.start();

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
