package sec01;

public interface RemoteControl {
	// public int s=3;  �������̽� �ʵ��� �ùٸ� ��� ����� �ƴ�. �������̽� �ʵ�� ��� �ʵ常 ����� ������. �ʵ� �̸��� �빮�ڷ� �����.
	public int S=3;
	public int MAX_VOLUME=10; // static final�� �����ص� �ڵ����� ����.  
	public int MIN_VOLUME=0; 
	
	// public String NAME; �������̽� ����� �ݵ�� ����� ���ÿ� �ʱⰪ�� �����ؾ���.
	public String NAME="ȫ�浿";
	
	void turnOn(); // �������̽��� �޼ҵ� �������� �ʿ���� �߻�޼ҵ�(����Ÿ��, �޼ҵ��̸�, �Ű������� ����ϰ�. {}�߰�ȣ�� ������ ����)�� ������.  
	// public abstract�� �����ص� �ڵ����� ����. 
	void tunrOff();
	public void setVolume(int volume);
	
}
