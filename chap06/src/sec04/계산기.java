package sec04;

public class ���� {

	void powerOn() {
		System.out.println("������ �մϴ�.");
	}

	void powerOff() {
		System.out.println("������ ���ϴ�.");
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

// 0�̳��´ٸ� 0�� �Է��Ҽ����ٴ� ������� �װԾƴ϶�� �̻���� �����Բ��ϱ�.
	String multi(int x, int y) {
		if (x == 0 || y == 0) {
			String message = "0�� �Է��� �� �����ϴ�.";
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
