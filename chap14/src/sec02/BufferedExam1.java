package sec02;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class BufferedExam1 {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("c:/temp/phone.txt");
		Writer writer = new OutputStreamWriter(fos);

		while (true) {
			System.out.println("폰번호를 입력하세요.");
			String phoneNum = s.nextLine();
			if (phoneNum.equals("그만"))
				break;
			writer.write(phoneNum + "\n");
		}
		writer.flush();
		writer.close();

		Reader reader = new FileReader("c:/temp/phone.txt");
		BufferedReader breader = new BufferedReader(reader);

		while (true) {
			String phone = breader.readLine();
			if (phone == null)
				break;
			System.out.println(phone);
		}

		reader.close();

	}

}
