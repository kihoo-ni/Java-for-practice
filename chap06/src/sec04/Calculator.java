package sec04;

public class Calculator {
	
	int plus(int x,int y) { //합계를 구하는 메소드
		int result =x+y;
		return result;
	}
	
	double avg(int x, int y) { //평균을 구하는 메소드 
		double sum=plus(x,y);
		double result=sum/2;
		return result;
	}
	
	void execute() {
		double result= avg(7,10);
		println("실행결과: "+result);
		
	}
	void println(String message) { //위에 실행결과(문자열)+result(int)합치면 문자열이라서 String로 씀.
		System.out.println(message);
	}
}
