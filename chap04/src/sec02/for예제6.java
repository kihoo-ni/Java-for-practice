package sec02;

public class for예제6 {

	public static void main(String[] args) {
		// 32에서 59까지의 수 중 짝수만 출력
		/*for(int i=32; i<=59; i+=2) {
			System.out.println(i);
		}*/
		for (int i = 32; i < 60; i ++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
