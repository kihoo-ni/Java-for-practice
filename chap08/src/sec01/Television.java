package sec01;

public class Television implements RemoteControl {
	private int volume;

	public void turnOn() { //�ҽ� �̿��ؼ� �������̽� �޼ҵ� ���� 
		System.out.println("TV�� �մϴ�.");
	}

	public void tunrOff() {
		System.out.println("TV�� ���ϴ�.");

	}

	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
			} else if(volume<RemoteControl.MIN_VOLUME) {
				this.volume=RemoteControl.MIN_VOLUME;
		} else {
			this.volume=volume; //�������̽��� �ʵ�� ������̶� ����Ұ���.
		}
		System.out.println("���� TV ����: "+this.volume);
	}
		
	
}