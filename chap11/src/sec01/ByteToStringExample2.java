package sec01;

import java.io.IOException;

public class ByteToStringExample2 {

	public static void main(String[] args) throws IOException {

		byte[] bytes = new byte[100];
		System.out.println("입력하세요 : ");
		char readByteNo = (char) System.in.read(bytes);
		// system.in.read 는 매개변수 byte배열의 갯수 바이트수로 환산해서 int로 리턴함.
		// 만약 char 일경우 바이트수만큼 아스키코드환산값으로 리턴함
		// default 값이 알파벳은 1바이트 한글은 2바이트 (utf-8이면 알파벳1바이트 한글 3바이트변환함.)
		System.out.println(readByteNo);
		String str = new String(bytes, 0, readByteNo - 2);
		System.out.println(str);

	}

}
