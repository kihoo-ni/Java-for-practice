package sec01;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;

	//Searchable의 추상메소드의 실체 메소드
	public void search(String url) {

	}
	//RemoteControl의 추상메소드 3개의 실체 메소드
	public void turnOn() {
		System.out.println("스마트 TV를 켭니다.");
	}

	public void tunrOff() {
		System.out.println("스마트 TV를 끕니다.");

	}

	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume; 
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}


}
