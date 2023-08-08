package sec01;

public class CarExample {

	public static void main(String[] args) {
		System.out.println("차가 출발합니다.");

		Thread car1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 50; i <= 200; i += 50) {
					System.out.println("현재 속도 " + i + "km");
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
			}
		});

		car1.start();
		
		
		
		for (int i = 1; i <= 4; i++) {
			System.out.print("속도를 올립니다.");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
		System.out.println("차가 멈춥니다.");
	}

}
