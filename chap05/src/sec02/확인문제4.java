package sec02;

public class 확인문제4 {

	public static void main(String[] args) {
		int max = 0; //가장작은값이어야 비교가 가능하기때문에 0을 넣음.
		int[] array = { 1, 5, 3, 8, 2 };
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("최댓값 : " + max);
	}

}
