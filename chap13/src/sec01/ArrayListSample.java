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

		int size = list.size(); // list의 갯수
		System.out.println("총 객체수: " + size);
		System.out.println();

		String skill = list.get(2); // index2 가져오기
		System.out.println("2: " + skill);
		System.out.println();


		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();


		list.remove(2); // index2 데이터 삭제(database)
		list.remove(2); // index3이 위에 index2가 삭제되서 index2가됨. 데이터 삭제(servlet)
		list.remove("iBATIS"); // 내용으로 삭제 가능함.
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}

}
