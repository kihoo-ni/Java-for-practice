package sec02;

public class 다차원배열1 {

	public static void main(String[] args) {
		int[][] mathScore = new int[2][3];

		for (int i = 0; i < mathScore.length; i++) {
			for (int k = 0; k < mathScore[i].length; k++) {
				System.out.println("mathScore[" + i + "][" + k + "]=" + mathScore[i][k]);
			}
		}
		System.out.println();

		int[][] englishScores = new int[2][];
		
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
//		englishScores[0][0]= 1;  << 특정 행렬에 저장하는 방식 

		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScore[" + i + "][" + k + "]=" + englishScores[i][k]);
			}
		}
		System.out.println();

		int[][] koreanScores = new int[4][];
		koreanScores[0] = new int[2];
		koreanScores[1] = new int[3];
		koreanScores[2] = new int[1];
		koreanScores[3] = new int[3];

		for (int i = 0; i < koreanScores.length; i++) {
			for (int k = 0; k < koreanScores[i].length; k++) {
				System.out.println("koreanScores[" + i + "][" + k + "]=" + koreanScores[i][k]);
			}
		}
		System.out.println();

		int[][] koreanScores1 = { { 85, 93 }, { 72, 91, 88 }, { 66 }, { 55, 57, 99 } };
		for (int i = 0; i < koreanScores1.length; i++) {
			for (int k = 0; k < koreanScores1[i].length; k++) {
				System.out.println("koreanScores[" + i + "][" + k + "]=" + koreanScores1[i][k]);
			}
		}
	}
}
