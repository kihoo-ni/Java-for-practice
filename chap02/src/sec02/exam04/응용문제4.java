package sec02.exam04;

import java.util.Scanner;

public class ���빮��4 {

	public static void main(String[] args) {

		//string name = s.next(); �̸��Է�
		//int age = s.nextint(); �����Է�
		
		Scanner s=new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���.");

		int age=s.nextInt();
		System.out.println("�̸��� �Է��ϼ���.");
		String name = s.next();
					
		if(age<20) {
			System.out.println(name+"���� û���Դϴ�.");
			
			
		} else {
			System.out.println(name+"���� û���Դϴ�.");
		}
		
		
		
		
		
	}
	

}
