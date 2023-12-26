package sec02;

public class continue예제2 {

	public static void main(String[] args) {
		// 1~100까지 숫자중에서 3의배수이면서 5의 배수인 숫자만 출력하세요.
		// continue 활용
		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0 || i % 5 != 0) { //3의배수가 아니거나 5의배수가 아닌것은 출력에서 제외해야하기때문에 continue 설정. 
				continue;
			}
			System.out.println(i);
		}

	}

}
