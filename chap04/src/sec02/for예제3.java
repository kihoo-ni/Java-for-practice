package sec02;

public class for예제3 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) { // int i=0; i<=100; i+=3 이렇게 설정해도 됨. 
			if (i % 3 == 0) {
				sum += i; //sum = sum + i; 
			}
		}
		System.out.println("1~100까지 3의 배수의 합계: " + sum);
	}

}
