package sec04;

public class CarExample {

	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.powerOn();
		int result1=myCar.speedUp(50);
		System.out.println("����ӵ��� "+result1);
		int result2=myCar.speedUp(30);
		System.out.println("����ӵ��� "+result2);
		int result3=myCar.speedDown(90);
		System.out.println("����ӵ��� "+result3);
		int result4=myCar.breakZero();
		System.out.println("����ӵ��� "+result4);
		myCar.powerOff();
	}

}
