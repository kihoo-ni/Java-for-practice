package sec02;

public class 자동차예제1 {

	public static void main(String[] args) {
		Car myCar = new Car(); // Car 객체생성 인스턴스가 myCar

		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);

		myCar.company = "페라리";
		myCar.model = "f40"; // 기존에 car class에 선언되었던 필드값을 바꿀수 있음.
		System.out.println("수정된 회사 : " + myCar.company);
		System.out.println("수정된 모델명 : " + myCar.model);
	}
}
