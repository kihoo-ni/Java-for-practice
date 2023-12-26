package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {

		int intValue = 10;
		byte byteValue = (byte) intValue;
		System.out.println(byteValue);

		// int intValue1=200;
		// byte byteValue1=(byte)intValue1;
		// System.out.println(byteValue1);

		int intValue1 = 44032;
		char charValue = (char) intValue1;
		System.out.println(charValue);

		double doubleValue = 3.14;
		int intValue2 = (int) doubleValue;
		System.out.println(intValue2);

		// java 에서 %는 나머지를 구함 5%2 =1

		byte x = 10;
		byte y = 20;
		int result = x + y; // int타입보다 작은 byte short char의 경우에 사칙연산 할경우 int로 자동타입변환됨
							// byte resulf=x+y; < 컴파일에러 발생

		System.out.println(result);

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
