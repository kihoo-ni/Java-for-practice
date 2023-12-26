package sec01;

public class NullPointerExceptionExample { // 널 포인터 예외
	public static void main(String[] args) {
		String data = null;
		int num = 5;
		//System.out.println(data.toString()); // data 변수에 널값 넣었기 때문에 예외 발생.
		// 실행 예외 발생 : 에러 코드로 확인해야함.

		String e = String.valueOf(data);
		System.out.println(e); // valueOf는 null 값 처리됨.

		// System.out.println(num.toString());
		System.out.println(Integer.toString(num)); // 이렇게 하면 맞음.
		// 일반 예외 발생: 프로그래머가 미리 확인 가능함.

		String b = String.valueOf(num);
		System.out.println(b);

		String c = Integer.toString(num);
		System.out.println(c);
		
		String num1="이기훈";
		System.out.println(num1.toString());
		// valueOf, toString 모두 Object 타입의 값을 String 으로 변환함.
		// 단 toString은 null 처리 안됨
		// Object 담긴 값이 String 아니여도 출력

		// valueOf는 null 값 처리 됨.
		
	}
}
