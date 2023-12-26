package sec04;

public class PrintfExample {

	public static void main(String[] args) {
		int A = 123;
		System.out.printf("상품의 가격: %d원\n", A);
		System.out.printf("상품의 가격: %6d원\n", A);

		int A1 = 1234;
		System.out.printf("상품의 가격:%d원\n", A1);
		System.out.printf("상품의 가격:%6d원\n", A1);
		System.out.printf("상품의 가격:%-6d원\n", A1);

		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.3f\n", 10, area);

		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d|%-10s|%10s\n", 1, name, job);

		
		
		
		
		
		
	}

}
