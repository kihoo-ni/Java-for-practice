package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {

		long longValue = 5000000000l;
		double doubleValue = longValue;
		System.out.println(doubleValue);

		byte a = 10;
		int b = a;
		System.out.println(b);

		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue:" + intValue);

		char charValue = '사';
		intValue = charValue;
		System.out.println("사의 유니코드:" + intValue);

		intValue = 50;
		long longValue1 = intValue;
		System.out.println("longValue:" + longValue1);

		longValue = 100;
		float floatValue=longValue;
		System.out.println("floatValue:"+floatValue);
		
		
		
	}

}
