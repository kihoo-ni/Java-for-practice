package sec02;

public class Ȯ�ι���6 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) { // ��ü�ݺ�Ƚ���� 4ȸ ( ��4�� ���)
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int e = 1; e <= i; e++) {
				System.out.print("*"); // *�� ������ ���
			}
			System.out.println(); // �ٺ���
		}

	}
}
