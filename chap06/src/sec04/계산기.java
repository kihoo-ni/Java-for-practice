package sec04;

public class 계산기 {

	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	int minus(int x, int y) {
		int result;
		if (y > x) {
			result = y - x;
		} else {

			result = x - y;
		}
		return result;

	}

	int mul(int x, int y) {
		int result = x * y;
		return result;
	}

// 0이나온다면 0은 입력할수없다는 오류출력 그게아니라면 이상없이 나오게끔하기.
	String multi(int x, int y) {
		if (x == 0 || y == 0) {
			String message = "0은 입력할 수 없습니다.";
			return message;
		} else {
			int result = x * y;
			return String.valueOf(result);
		}
	}

	double divide(int x, int y) {
		double result = (double) x / y;
		return result;
	}
	
	
}
