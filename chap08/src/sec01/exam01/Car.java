package sec01.exam01;

public interface Car {
	
	//인터페이스는 상수 필드와 추상메소드만 사용가능함.
	
	int MIN_SPEED=0;
	int MAX_SPEED=200;
	// 상수필드는 public static final 자동으로 붙음.
	
	void speedUp(int speed);
	void speedDown(int speed);
	//추상 메소드는 public abstract가 자동으로 붙음.
}
