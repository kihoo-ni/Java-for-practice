package sec02;

import java.util.Scanner;

public class while������3 {

	public static void main(String[] args) {
		// int Ÿ���� ���� num �� �����ϰ� Ű����� ���� �Է¹ޱ�
		// 1~���� num ���� ���� ����ϴ� ���α׷��� �ۼ�.
		Scanner s= new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���: ");
		int num=s.nextInt();
		int i = 1;
		int sum=0;
		while (i <= num) {
			sum=sum+i;
			i++; //i++������ �����ؾ��Ѵ�. 
		} 
		System.out.println("1~"+num+" ��: "+sum); //���� num�� �ƴ϶� i�ϰ�� i++; ������ +1���� �����Ȱ����� ���̰Ե�.
	}

}
