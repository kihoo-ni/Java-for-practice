package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/temp/test2.db");
		byte[] array = { 10, 20, 30 };

		os.write(array);
		os.flush(); // ��� ����Ʈ�� ���
		os.close(); // ��� ��Ʈ�� �ݱ�
	}

}
