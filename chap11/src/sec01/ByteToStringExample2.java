package sec01;

import java.io.IOException;

public class ByteToStringExample2 {

	public static void main(String[] args) throws IOException {

		byte[] bytes = new byte[100];
		System.out.println("�Է��ϼ��� : ");
		char readByteNo = (char) System.in.read(bytes);
		// system.in.read �� �Ű����� byte�迭�� ���� ����Ʈ���� ȯ���ؼ� int�� ������.
		// ���� char �ϰ�� ����Ʈ����ŭ �ƽ�Ű�ڵ�ȯ�갪���� ������
		// default ���� ���ĺ��� 1����Ʈ �ѱ��� 2����Ʈ (utf-8�̸� ���ĺ�1����Ʈ �ѱ� 3����Ʈ��ȯ��.)
		System.out.println(readByteNo);
		String str = new String(bytes, 0, readByteNo - 2);
		System.out.println(str);

	}

}
