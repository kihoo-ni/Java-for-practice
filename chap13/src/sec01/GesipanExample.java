package sec01;

import java.util.ArrayList;
import java.util.List;

public class GesipanExample {

	public static void main(String[] args) {

		List<Gesipan> list = new ArrayList<>();

		list.add(new Gesipan(1, "8월 수업일정", "자바 개인 프로젝트 발표", "홍길동"));
		list.add(new Gesipan(2, "9월 수업일정", "데이터베이스", "홍길동"));
		list.add(new Gesipan(3, "10월 수업일정", "JSP", "홍길동"));
		list.add(new Gesipan(4, "11월 수업일정", "팀프로젝트 준비", "홍길동"));

		for (int i = 0; i < list.size(); i++) {
			Gesipan str = list.get(i);
			System.out.println(str.number + " " + str.subject + " " + str.content + " " + str.user);
		}
	}

}
