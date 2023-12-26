package sec03;

public class 자동차예제2 {

	public static void main(String[] args) {
		Car car2 = new Car("BMW750i", 250);

		System.out.println("모델명 : " + car2.model);
		System.out.println("속도 : " + car2.speed);
		System.out.println("제조회사 : " + car2.company); // 값을 넣은적이 없어서 null나옴.

		Car car3 = new Car("테슬라3", "빨강", 350);
		System.out.println("모델명 : " + car3.model);
		System.out.println("컬러 : " + car3.color);
		System.out.println("최고속도 : " + car3.maxSpeed);

		Car car4 = new Car("람보르기니", "블랙");
		System.out.println(car4.model + car4.color + car4.maxSpeed);
	}

}
