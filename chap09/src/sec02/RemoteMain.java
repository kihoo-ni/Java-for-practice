package sec02;

public class RemoteMain {

	public static void main(String[] args) {
		Remote rm = new Remote();
		rm.rc.turnOn();
		rm.method1();

		rm.method2(

				new RemoteControl() {

					@Override
					public void turnOn() {
						System.out.println("Smart TV¸¦ ÄÕ´Ï´Ù.");
					}

					@Override
					public void turnOff() {
						System.out.println("Smart TV¸¦ ²ü´Ï´Ù.");

					}
				}

		);
	}

}
