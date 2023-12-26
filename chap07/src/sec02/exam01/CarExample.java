package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Truck truck = new Truck("흰색", "벤츠", 3, "중");

		Car car = truck; // 자동 타입 변환
		
		car.speedUp(30); // 부모 메소드 호출
		/* car.maxSpeed(50); 자식타입이 변환되었기 때문에 자식 메소드는 호출 불가능.
		 * truck.maxSpeed(50); 은 가능 car가 아니라서 상관없음. */
		
		car.start(); //자식의 메소드이지만 오버라이딩했기 때문에 호출 가능.
	}

}
