package sec02;

public class TryCatchFinallyExample2 {
	public static void main(String[] args) {

		String data1 = null;
		String data2 = null;
		//Run configuration 에서 arguments값 변경해보기
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개변수가 부족합니다.");
			return; //중지시키는 효과가 있음. void method에서 쓰는 return; 같은 느낌.
		}

		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("두수의 합은 : " + result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}
}
