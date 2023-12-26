package sec01;

public class ClassExample {

	public static void main(String[] args) {

		Key key = new Key(50); // (객체를 통해 얻음)
		Class clazz = key.getClass();
		System.out.println(clazz.getName()); // 패키지와 클래스 이름출력

		Class clazz2 = Member.class; // (클래스로 부터 객체 얻음)
		System.out.println(clazz2.getSimpleName()); // 클래스 이름출력

	}

}
