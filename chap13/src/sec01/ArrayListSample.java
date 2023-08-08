package sec01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Java"); // index0
		list.add("JDBC"); // index1
		list.add("Servlet/JSP"); // index3
		list.add(2, "Database"); // index2

		list.add("iBATIS"); // index4

		int size = list.size(); // list�� ����
		System.out.println("�� ��ü��: " + size);
		System.out.println();

		String skill = list.get(2); // index2 ��������
		System.out.println("2: " + skill);
		System.out.println();


		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();


		list.remove(2); // index2 ������ ����(database)
		list.remove(2); // index3�� ���� index2�� �����Ǽ� index2����. ������ ����(servlet)
		list.remove("iBATIS"); // �������� ���� ������.
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}

}
