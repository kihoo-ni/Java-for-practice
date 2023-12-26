package sec02;

public class 브레이크예제1 {

	public static void main(String[] args) {
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}

}
