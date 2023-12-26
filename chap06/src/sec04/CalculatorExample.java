package sec04;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCal=new Calculator();
		myCal.execute();//execute 메소드 실행함.
		
		myCal.println("가나다"+67); //리턴값 없음.
		
		int result = myCal.plus(6, 4); //리턴값을 출력
		System.out.println(result);
		
		double result2=myCal.avg(10, 15); //plus메소드 내부호출 3번 해서 평균구함.
		System.out.println(result2);
	}

}
