package sec02;

public class 확인문제1 {

	public static void main(String[] args) {
		byte b = 5; 
		b=(byte)-b;
		int result = 10 / b;
		System.out.println(result);
	}

}
//byte b = 5; 
//b=--b;
//int result = -10 / b;
//System.out.println(result);

//byte b = 5; 
//int c=-b;
// byte b는 b=-b; 할경우 int로 변환됨 따라서 새로운 변수를 int로 설정하는 것이 좋음.
//result = 10 / c;
//System.out.println(result);
