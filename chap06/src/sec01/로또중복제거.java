package sec01;

public class �ζ��ߺ����� {

	public static void main(String[] args) {
		int num = 0; // ��ȣ �ʱⰪ ����
		int[] lotto = new int[6]; // lotto �迭����
		boolean[] check = new boolean[46];
		// ��ȣ�� ������ �Ǵ��ϴ� �迭 ���� 1~45�� �ʿ������� �迭�� 0���� �����ϹǷ� �� 46�� ����

		for (int i = 0; i < lotto.length; i++) { // �� 6�� ���� ����
			num = (int) (Math.random() * 45) + 1; // ���� ��������
			
			if (check[num] == false) {
				// boolean�� �ʱⰪ�� false�� �Ǿ�����
				// ���� ���� �ڸ��� ���� ���̾����� �ش� ���ڸ� �����ϰ� �ش��ڸ����� true�� ������.
				lotto[i] = num;
				check[num] = true;
			} else {
				i--; // i--�� �����ν� �׼��ں��� �ٽ� �ݺ���.
			}

		}
		for (int k = 0; k < lotto.length; k++) {
			System.out.print(lotto[k] + " ");
		}
	}

}
