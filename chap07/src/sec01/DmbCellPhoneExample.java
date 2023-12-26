package sec01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10); //부모부터 먼저보고 자식생성자 생성함.

		// 상속받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);

		// DmbCellPhone 필드 출력
		System.out.println("채널: " + dmbCellPhone.channel);

		dmbCellPhone.turnOnDmb(); // DmbCellPhone 메소드 출력

		dmbCellPhone.bell(); // 상속받은 메소드 출력
	}

}
