package sec02;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");

		} finally {
			System.out.println("정상 처리 되었습니다.");
		}

	}
}
