package sec01.exam06;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	/*
	 * @Override 
	 * public void stop() { System.out.println("������ī�� ����"); speed=0; }
	 * final �޼ҵ� ������ �Ұ���.
	 */
	public void stop(int x) { System.out.println("������ī�� ����"); speed=0; }
	// ���ϰ��̳� �Ű������� �����ϸ� �޼ҵ� �������̵� x 
	// �������̵�� ������ �ǵ�°� ������ �ܺ� �Ķ����,�޼ҵ�� ����.
	
	//�����ε��� �޼ҵ��̸� ���ƾ��ϰ� �Ű���������Ÿ�Լ����� �޶�ߵ�. ����Ÿ���� �޶� �����ε� �ƴ�.
	
	
}
