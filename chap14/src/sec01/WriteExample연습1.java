package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample연습1 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/address.txt");
		Scanner s = new Scanner(System.in);
		System.out.println("주소를 입력하세요");
		String address = s.nextLine();
		byte[] add = address.getBytes();
		os.write(add, 5, 4);

		os.flush();
		os.close();
	}

}
