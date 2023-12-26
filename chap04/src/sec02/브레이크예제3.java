package sec02;

public class 브레이크예제3 {

	public static void main(String[] args) {

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter; //브레이크 지정하지 않으면 엄마for가 Z가 될때까지 반복함. 
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
