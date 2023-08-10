package sec02;

import java.io.*;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다."); // 메소드, 매개변수 문자열

		String data = read(); // read()는 메소드, 매개변수 없음, 리턴타입 String
		System.out.println(data);
	}

	public static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("c:/temp/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		writer.write(str);
		writer.flush();
		writer.close();
	}

	public static String read() throws Exception {
		FileInputStream fis = new FileInputStream("c:/temp/test1.txt");
		Reader reader = new InputStreamReader(fis);
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, readCharNum); // buffer 배열의 첫번째 인덱스부터 readCharNum 값 만큼 스트링으로 만듦.
		return data;
	}

}
