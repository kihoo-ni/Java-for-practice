package sec03.exam07;

public class Ȯ�ι��� {

	public static void main(String[] args) {

		// Ȯ�ι���1

		// byte byteValue = 10;
		// char charValue = 'A';

		// 3 (�����Ͽ���) ������� �ڵ���ȯ x
		// short shortValue = charValue;
		// 4
		// double doubleValue = byteValue;

		// Ȯ�ι���2
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";

		double var = (double) intValue;
		byte var2 = (byte) intValue;
		int var3 = (int) doubleValue;
		// char var4 = (char) strValue;
		char var4 = strValue.charAt(0);

		// Ȯ�ι��� 5
		char c1 = 'a';
		// char c2 = 1;
		// int c3 = c1 + c2;
		int c2 = c1 + 1;
		System.out.println((char) c2);

		// Ȯ�ι���8

		double x1 = 3.5;
		double x2 = 2.7;
		int result = (int) x1 + (int) x2;
		System.out.println(result);
		
		
		
		
		
	}

}
