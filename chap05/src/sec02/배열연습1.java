package sec02;

import java.util.Scanner;

public class 배열연습1 {

	public static void main(String[] args) {
//		로또를 몇번하시겠습니까? scanner 입력
//		사용자가 입력한 숫자만큼 로또번호를 랜덤으로 출력하세요.
		Scanner s = new Scanner(System.in);
		System.out.println("로또를 몇번하시겠습니까?");
		int lottoTry = s.nextInt();
		

		for (int i = 1; i <= lottoTry; i++) { //i=0 i<lottoTry로 해도됨. 
			int[] lotto = new int[6];
			for (int k = 0; k < lotto.length; k++) {
				lotto[k] = (int) (Math.random() * 45) + 1;
				System.out.print(lotto[k] + " ");

			}
			System.out.println();
		}

	}

}
