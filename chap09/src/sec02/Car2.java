package sec02;

public class Car2 {
	Car car = new Car() {
		int speed;

		void speedUp(int speed) {
			this.speed = speed;
			System.out.println("속도가 " + speed + "만큼 증가합니다.");
		}

		@Override
		void stop() {
			System.out.println("자동차가 멈춥니다.");
			speedUp(50);
		}

	};

	void speedDown() {// 로컬 익명 객체 대입
		Car downCar = new Car() {

			@Override
			void stop() {
				System.out.println("속력저하로 자동차 멈춤");
				speedDown(30);
			}

			void speedDown(int speed) {
				this.speed = speed;
				System.out.println("속도가 " + speed + "만큼 감소합니다.");
			}

		};
		downCar.stop(); // speedDown 메소드를 호출하면 익명 객체안의 메소드가 자동으로 실행되지 않음.
	}

}
