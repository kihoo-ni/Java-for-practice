package sec02;

public class ����for�� {

	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		for (int score : scores) { // for(int i=0; i<scores.length; i++) { sum +=scores[i];}
			sum += score;
		}
		System.out.println("���� ���� : " + sum);
	}

}
