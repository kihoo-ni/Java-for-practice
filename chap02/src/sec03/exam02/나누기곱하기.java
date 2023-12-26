package sec03.exam02;

import java.util.Scanner;

public class 나누기곱하기 {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요");
		
		int a=s.nextInt();
		
		
		System.out.println("두번째 숫자를 입력하세요");
		
		int b=s.nextInt();
		
		
		System.out.println("연산기호를 입력하세요");
		
		String c=s.next();  
		char d=c.charAt(0);
		
	
		//double multi=(double) a*b; //int multi=a*b;
		double e=(double) a*b;
		//double div =(double)a/b;		
		double f=(double) a/b;	
		
		if(d=='*'){     //String의 경우로 하려면 c=="*"로 하면됨. 
			System.out.println("입력하신 연산의 결과는 "+e+"입니다.");
		}else {
			System.out.println("입력하신 연산의 결과는"+f+"입니다.");
		}
		
		
		
		
		
		
		
		
	}

}
