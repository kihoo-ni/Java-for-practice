package sec01_1;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("�ּҸ� �Է��ϼ���");
		Writer writer = new FileWriter("c:/temp/address2.txt");
		String add = s.nextLine();

		writer.write(add, 6, 2); // ����Ʈ����� �ƴ϶� ���� ����̶� �ε��������� ���밡����.
		// ������� �ε�����(���) ���������� ��� �� ���ڼ�
		writer.flush();
		writer.close();
	}

}
