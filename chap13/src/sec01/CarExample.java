package sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {

		List<Car> list = new ArrayList<>();

		// 1 ������ �߰�
		// ����ڷκ��� �����͸� �Է¹޾� �ڵ��� Ŭ���� ��ü�� ����
		// ����Ʈ�� �߰��ϼ���

		// 2 ������ ����
		// ����ڷκ��� �ε��� ��ȣ�� �Է¹޾� ����Ʈ �����͸� �����ϼ���

		// 3 ������ ���
		// �Էµ� ����Ʈ �����͸� ��� ����մϴ�.

		// 4 ����
		Scanner s = new Scanner(System.in);
		boolean x = true;

		while (x) {
			System.out.println("�޴� ��ȣ�� �Է��ϼ���");
			int i = s.nextInt();
			if (i == 1) {
				System.out.println("�ڵ��� Ŭ���� ��ü�� �����ϼ���");
				list.add(new Car(s.next(), s.nextInt(), s.nextInt(), s.next()));
			} else if (i == 2) {
				System.out.println("�����ϰ� ���� �ε��� ��ȣ�� �Է��ϼ���");
				list.remove(s.nextInt());
			} else if (i == 3) {
				for (int k = 0; k < list.size(); k++) {
					Car num = list.get(k);
					System.out.println(num.company + " " + num.cost + " " + num.maxSpeed + " " + num.color);
				}

			} else {
				
				x = false;
			}
		}
	}
}
