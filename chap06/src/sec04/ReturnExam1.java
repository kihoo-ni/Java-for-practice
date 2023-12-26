package sec04;

public class ReturnExam1 {

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	int plus2(int x, int y) {
		byte result =  (byte) (x + y); // 하향식이라 오류는 없음. 하지만 byte는 128이후는 나오지않음.
		return result;
	}

	public static void main(String[] args) {
		ReturnExam1 reExam = new ReturnExam1();
		int result1 = reExam.plus(200, 300);
		System.out.println(result1);
		int result2 = reExam.plus2(200, 300);
		System.out.println(result2);
	}

}
