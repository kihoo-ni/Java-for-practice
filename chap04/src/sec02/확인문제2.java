package sec02;

public class Ȯ�ι���2 {

	public static void main(String[] args) {
//			1���� 100������ �����߿��� 3�� ����� ������ ���ϴ� �ڵ�
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) { // if(i%3!=0) {continue;} sum+=i; �� continue�� �����Ҽ�����.
				sum += i;
			}

		}
		System.out.println("3�� ����� ����: " + sum);
	}

}
