package sec02;

import java.util.Scanner;

public class �迭����3 {

	public static void main(String[] args) {
		// ����ڿ��� 3���� �̸��� �Է¹޾� �迭�� �����ϼ���
		// String Ÿ���� 5��¥�� �迭�� ������ �����ϼ���
		// ù��° �迭���� �ι�° �迭�� ���� �����ϼ���
		// ��) �ι�° �迭�� ö��,����,����,null,null
		// �ι�° �迭�� null ���� ������ ä�켼��
		Scanner s = new Scanner(System.in);
		String[] name = new String[3];
		for (int i = 0; i < name.length; i++) {
			System.out.println("�̸��� �Է��ϼ���");
			name[i] = s.next();
		}
		String[] name1 = new String[5];

		System.arraycopy(name, 0, name1, 0, name.length);

		for (int i = 0; i < name1.length; i++) {
			if (i >= (name1.length - 2)) { // if(i>=3){ name1[i]="����";} system.out.print(name1[i]+",");�� �����ϸ� �ξ� ������.
				name1[i] = "����";
				System.out.print(name1[i] + ", ");
			} else {
				System.out.print(name1[i] + ", ");
			}
		}

	}
}
