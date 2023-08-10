package sec01_1;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("주소를 입력하세요");
		Writer writer = new FileWriter("c:/temp/address2.txt");
		String add = s.nextLine();

		writer.write(add, 6, 2); // 바이트기반이 아니라 문자 기반이라 인덱스값으로 적용가능함.
		// 가운데숫자 인덱스값(출발) 마지막숫자 출력 할 글자수
		writer.flush();
		writer.close();
	}

}
