package sec04;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCal=new Calculator();
		myCal.execute();//execute �޼ҵ� ������.
		
		myCal.println("������"+67); //���ϰ� ����.
		
		int result = myCal.plus(6, 4); //���ϰ��� ���
		System.out.println(result);
		
		double result2=myCal.avg(10, 15); //plus�޼ҵ� ����ȣ�� 3�� �ؼ� ��ձ���.
		System.out.println(result2);
	}

}
