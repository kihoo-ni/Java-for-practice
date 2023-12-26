package sec01;

public class ArrayIndexOutOfBoundsException { // 배열 범위 예외

	public static void main(String[] args) {
		String[] a = new String[10];
		a[0] = "가나다";
		String data1 = a[0];

		System.out.println(data1);
		// args[0] = "김"; 으로 하면 맞음 main메소드는 방갯수 정할필요 없음.
		String data2 = args[0];
		System.out.println(data2);
		// 실행환경 변수값 2개로 처리하고싶으면 가나다 라마바로 2개로처리
		// 만약 "가나다 라마바"라면 1개로 처리
	}

}
