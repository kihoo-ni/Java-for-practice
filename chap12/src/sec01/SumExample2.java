package sec01;

public class SumExample2 {

	public static void main(String[] args) {
		// Runnable sum1 = new Sum();
		// Thread sum = new Thread(sum1); �͸�ü ������ �ش� ������ ������.
		Thread sum = new Thread(new Runnable() { // Runnable ���� =new Runnable (){} ��� �����ϸ��.

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
