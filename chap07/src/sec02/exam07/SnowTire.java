package sec02.exam07;

public class SnowTire  extends Tire{
	
	int snowChainWeight;
	int tirePressure;
	int price;
	String exchangeDate;
	
	
	@Override //�������̵� �Ƚᵵ �׳� �ν���. ������ ���°� ����.
	public void run() {
		System.out.println("����� Ÿ�̾ �������ϴ�.");
	}


	@Override
	public void tireExchange() {
			System.out.println("����� Ÿ�̾ ��ü�մϴ�.");
	}
	
	public void exchangeDate(int date) {
		System.out.println("����� Ÿ�̾� ��ü���� "+date+"�Դϴ�.");
	}
	
	
	
	
	
	
	
	
}
