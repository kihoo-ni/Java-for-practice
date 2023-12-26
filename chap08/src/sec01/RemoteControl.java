package sec01;

public interface RemoteControl {
	// public int s=3;  인터페이스 필드의 올바른 사용 방법이 아님. 인터페이스 필드는 상수 필드만 사용이 가능함. 필드 이름은 대문자로 써야함.
	public int S=3;
	public int MAX_VOLUME=10; // static final을 생략해도 자동으로 붙음.  
	public int MIN_VOLUME=0; 
	
	// public String NAME; 인터페이스 상수는 반드시 선언과 동시에 초기값을 지정해야함.
	public String NAME="홍길동";
	
	void turnOn(); // 인터페이스는 메소드 실행블록이 필요없는 추상메소드(리턴타입, 메소드이름, 매개변수만 기술하고. {}중괄호를 붙히지 않음)로 선언함.  
	// public abstract를 생략해도 자동으로 붙음. 
	void tunrOff();
	public void setVolume(int volume);
	
}
