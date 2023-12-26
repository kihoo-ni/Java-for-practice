package sec02;

public class 확인문제3 {

	public static void main(String[] args) {
		// while, Math.random() 이용하기
		// 두개의 주사위를 던져 나오는 값을 (1,2)로출력.
		// 눈의 합이 5가아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추기

		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + num1 + "," + num2 + ")");
			if (num1 + num2 == 5) {
				System.out.println("눈의 합이 5입니다.");
				break;
			}

		}
		
	}

}
