package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		OutputStream os = new FileOutputStream("c:/temp/name.txt");
		System.out.println("����� �̸���?");
		String name = s.next();
		byte[] data = name.getBytes(); // �迭��ĭ�� ���� �ϳ��� ��.
		for (int i = 0; i < data.length; i++) {
			os.write(data[i]);
		}

		os.flush(); // ��� ����Ʈ�� ���
		os.close(); // ��� ��Ʈ�� �ݱ�
	}

}
