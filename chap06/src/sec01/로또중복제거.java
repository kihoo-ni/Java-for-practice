package sec01;

public class 로또중복제거 {

	public static void main(String[] args) {
		int num = 0; // 번호 초기값 세팅
		int[] lotto = new int[6]; // lotto 배열생성
		boolean[] check = new boolean[46];
		// 번호가 같은지 판단하는 배열 생성 1~45가 필요하지만 배열은 0부터 시작하므로 총 46개 생성

		for (int i = 0; i < lotto.length; i++) { // 총 6개 숫자 추출
			num = (int) (Math.random() * 45) + 1; // 랜덤 숫자추출
			
			if (check[num] == false) {
				// boolean은 초기값이 false로 되어있음
				// 랜덤 숫자 자리를 뽑은 적이없으면 해당 숫자를 추출하고 해당자리값을 true로 변경함.
				lotto[i] = num;
				check[num] = true;
			} else {
				i--; // i--를 함으로써 그숫자부터 다시 반복함.
			}

		}
		for (int k = 0; k < lotto.length; k++) {
			System.out.print(lotto[k] + " ");
		}
	}

}
