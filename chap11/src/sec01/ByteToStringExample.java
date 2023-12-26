package sec01;

public class ByteToStringExample {

	public static void main(String[] args)  {
		byte[] Good = { 71, 111, 111, 100, 32, 109, 111, 114, 110, 105, 110, 103 };

		String str1 = new String(Good);
		System.out.println(str1);
		String str2 = new String(Good, 5, 7);
		System.out.println(str2);

		
	}

}
