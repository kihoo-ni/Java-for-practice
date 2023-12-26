package sec02;

public class 확인문제2 {

	public static void main(String[] args) {
//			1부터 100까지의 정수중에서 3의 배수의 총합을 구하는 코드
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) { // if(i%3!=0) {continue;} sum+=i; 로 continue로 설정할수있음.
				sum += i;
			}

		}
		System.out.println("3의 배수의 총합: " + sum);
	}

}
