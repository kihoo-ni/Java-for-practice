package sec02;

public class continue����2 {

	public static void main(String[] args) {
		// 1~100���� �����߿��� 3�ǹ���̸鼭 5�� ����� ���ڸ� ����ϼ���.
		// continue Ȱ��
		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0 || i % 5 != 0) { //3�ǹ���� �ƴϰų� 5�ǹ���� �ƴѰ��� ��¿��� �����ؾ��ϱ⶧���� continue ����. 
				continue;
			}
			System.out.println(i);
		}

	}

}
