package sec04;

public class CalculatorExample2 {

	public static void main(String[] args) {
		Calculator2 myCal=new Calculator2();
		
		double result1=myCal.areaRectangle(3.5);
		double result2=myCal.areaRectangle(3.5,7.5);
		
		System.out.println("���簢�� ����: "+result1);
		System.out.println("���簢�� ����: "+result2);
		
	}

}
