package sec01;

import java.io.UnsupportedEncodingException;

public class StringGetByteExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "æ»≥Á«œººø‰";
		byte[] byte1 = str.getBytes();
		System.out.println(byte1.length);

		byte[] byte2 = str.getBytes("UTF-8");
		System.out.println(byte2.length);
	}

}
