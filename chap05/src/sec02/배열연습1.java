package sec02;

import java.util.Scanner;

public class �迭����1 {

	public static void main(String[] args) {
//		�ζǸ� ����Ͻðڽ��ϱ�? scanner �Է�
//		����ڰ� �Է��� ���ڸ�ŭ �ζǹ�ȣ�� �������� ����ϼ���.
		Scanner s = new Scanner(System.in);
		System.out.println("�ζǸ� ����Ͻðڽ��ϱ�?");
		int lottoTry = s.nextInt();
		

		for (int i = 1; i <= lottoTry; i++) { //i=0 i<lottoTry�� �ص���. 
			int[] lotto = new int[6];
			for (int k = 0; k < lotto.length; k++) {
				lotto[k] = (int) (Math.random() * 45) + 1;
				System.out.print(lotto[k] + " ");

			}
			System.out.println();
		}

	}

}
