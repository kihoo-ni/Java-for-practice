package sec03.exam02;

import java.util.Scanner;

public class ��������ϱ� {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		
		int a=s.nextInt();
		
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		
		int b=s.nextInt();
		
		
		System.out.println("�����ȣ�� �Է��ϼ���");
		
		String c=s.next();  
		char d=c.charAt(0);
		
	
		//double multi=(double) a*b; //int multi=a*b;
		double e=(double) a*b;
		//double div =(double)a/b;		
		double f=(double) a/b;	
		
		if(d=='*'){     //String�� ���� �Ϸ��� c=="*"�� �ϸ��. 
			System.out.println("�Է��Ͻ� ������ ����� "+e+"�Դϴ�.");
		}else {
			System.out.println("�Է��Ͻ� ������ �����"+f+"�Դϴ�.");
		}
		
		
		
		
		
		
		
		
	}

}
