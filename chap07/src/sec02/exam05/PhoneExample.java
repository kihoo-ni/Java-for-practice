package sec02.exam05;

public class PhoneExample {

	public static void main(String[] args) {
		// SmartPhone sp = new SmartPhone(); 자식객체가 부모껄 상속받아도 자식객채로 생성하면 자식껄(필드, 메소드)로 가져와야함. 형변환과 관련없음.
		Phone p = new SmartPhone(); // 자식객체를 부모 객체에 타입변환 시킴 (자동변환)
		System.out.println(p.cost);
		p.powerOn();
		p.ring(); // 오버라이드 메소드 호출
		// p.videoOn(); 자식클래스 메소드는 호출 불가.
		// p.phoneCase="하드 케이스"; 자식클래스 필드 사용불가.
		
		SmartPhone sp=(SmartPhone)p; //부모 객체를 자식 객체에 강제 타입 변환 시킴.
		sp.phoneCase="하드 케이스"; //강제타입변환했기 때문에 SmartPhone 클래스 필드값 적용 가능함
		sp.videoOn(); // 강제타입변환했기 때문에 SmartPhone 클래스 메소드 적용 가능함
		sp.powerOn(); // 부모 객체 메소드 사용가능
		System.out.println(sp.cost); // 자식객체 필드값 출력
		
		// Phone p2=new Phone(); 
		//Smartphone sp2 =(Smartphone)p2;
		// 자식타입이 부모타입으로 자동변환 상태가 아닐경우 부모타입은 자식타입으로 강제 형변환 되지 않음.
	}

}
