package sec02;

public class Ȯ�ι���3 {

	public static void main(String[] args) {
		// while, Math.random() �̿��ϱ�
		// �ΰ��� �ֻ����� ���� ������ ���� (1,2)�����.
		// ���� ���� 5���ƴϸ� ��� �ֻ����� ������, ���� ���� 5�̸� ������ ���߱�

		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + num1 + "," + num2 + ")");
			if (num1 + num2 == 5) {
				System.out.println("���� ���� 5�Դϴ�.");
				break;
			}

		}
		
	}

}
