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

		// java ���� %�� �������� ���� 5%2 =1

		byte x = 10;
		byte y = 20;
		int result = x + y; // intŸ�Ժ��� ���� byte short char�� ��쿡 ��Ģ���� �Ұ�� int�� �ڵ�Ÿ�Ժ�ȯ��
							// byte resulf=x+y; < �����Ͽ��� �߻�

		System.out.println(result);

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
