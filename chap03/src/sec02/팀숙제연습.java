package sec02;

import java.util.Scanner;

public class ���������� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("�л�����?");
		int x=s.nextInt();
		
		System.out.println("���ٿ� ��� �ɳ���?");
		int y=s.nextInt();
		
		int line=x/y;
		int remain=x%y;
		if(remain==0) {
			System.out.println("�� "+line+"���̰� ���� �¼����� 0�� �Դϴ�.");
		}else {
			int result=line+1; int remain1=result*y-x;
			System.out.println("�� "+result+"���̰� ���� �¼����� "+remain1+"�� �Դϴ�.");
		}
	}

}
