package sec01;

public class RemoteControlExample {

	public static void main(String[] args) {
		// 먼저 인터페이스 변수를 선언하고 그다음 구현객체를 대입함. 다중 인터페이스를 구현할 수 있음.
		RemoteControl rc;
		rc=new Television();
		rc=new Audio();
	}

}
