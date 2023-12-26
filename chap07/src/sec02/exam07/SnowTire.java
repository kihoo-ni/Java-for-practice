package sec02.exam07;

public class SnowTire  extends Tire{
	
	int snowChainWeight;
	int tirePressure;
	int price;
	String exchangeDate;
	
	
	@Override //오버라이드 안써도 그냥 인식함. 하지만 쓰는게 좋음.
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다.");
	}


	@Override
	public void tireExchange() {
			System.out.println("스노우 타이어를 교체합니다.");
	}
	
	public void exchangeDate(int date) {
		System.out.println("스노우 타이어 교체일은 "+date+"입니다.");
	}
	
	
	
	
	
	
	
	
}
