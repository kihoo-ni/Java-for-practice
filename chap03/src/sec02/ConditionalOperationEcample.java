package sec02;

import java.util.Scanner;

public class ConditionalOperationEcample {

	public static void main(String[] args) {
		// ����ڰ� ������ �Է�. ������ 90�� �̻� "��", 80�� �̻� "��", ������ "��"
		
		Scanner s=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int score =s.nextInt();
		char grade = (score >= 90) ? '��' : ((score >= 80) ? '��' : '��');
		System.out.println(score + "���� " + grade + "����Դϴ�.");
	}

}
