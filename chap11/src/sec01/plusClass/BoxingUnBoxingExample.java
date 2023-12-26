package sec01.plusClass;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// Wrapper 클래스 박싱 (포장)
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");

		// Wrapper 클래스 언박싱 (포장 해제)
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		// int value3 = obj3; //자동언박싱

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

		Integer obj4 = new Integer("200");
		Integer obj5 = new Integer("200");
		System.out.println(obj4 == obj5);

		int num1 = 100;
		int num2 = 100;

		System.out.println(num1 == num2);

		Integer num10 = 127; // 128이상부터 비교 인식안함. 따라서 이퀄스 쓰자
		Integer num11 = 127;
		System.out.println(num10 == num11); // int가 127이하라 true나옴 ==연산자로 비교가능함. 원래는 나오면안됨.
		Integer num5 = 300;
		Integer num6 = 300;
		System.out.println(num5 == num6); // false 나옴 비교불가.
		System.out.println(num5.equals(num6)); // wrapper 클래스는 이퀄스로 비교하자

		Integer obj6 = 100;
		// Integer obj6 = "100"; 문자열이라 자동박싱안됨.
		// Integer obj6 = new Integer("100");

		int i = 130;
		Integer i1 = new Integer(130);
		System.out.println(i == i1); // 래퍼클래스가 자동으로 언박싱되서 값으로 비교함.
	}

}
