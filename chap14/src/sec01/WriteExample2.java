package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		OutputStream os = new FileOutputStream("c:/temp/name.txt");
		System.out.println("당신의 이름은?");
		String name = s.next();
		byte[] data = name.getBytes(); // 배열한칸에 글자 하나씩 들어감.
		for (int i = 0; i < data.length; i++) {
			os.write(data[i]);
		}

		os.flush(); // 모든 바이트를 출력
		os.close(); // 출력 스트림 닫기
	}

}
