package sec01;

public class Audio implements RemoteControl {
		private int volume;

		public void turnOn() { //소스 이용해서 인터페이스 메소드 구현 
			System.out.println("오디오를 켭니다.");
		}

		public void tunrOff() {
			System.out.println("오디오를 끕니다.");

		}

		public void setVolume(int volume) {
			if(volume>RemoteControl.MAX_VOLUME) {
				this.volume=RemoteControl.MAX_VOLUME;
				} else if(volume<RemoteControl.MIN_VOLUME) {
					this.volume=RemoteControl.MIN_VOLUME;
			} else {
				this.volume=volume; //인터페이스의 필드는 상수값이라 변경불가능.
			}
			System.out.println("현재 오디오 볼륨: "+this.volume);
		}
		
	
}
