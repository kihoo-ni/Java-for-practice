package sec04;

public class Calculator {
	
	int plus(int x,int y) { //�հ踦 ���ϴ� �޼ҵ�
		int result =x+y;
		return result;
	}
	
	double avg(int x, int y) { //����� ���ϴ� �޼ҵ� 
		double sum=plus(x,y);
		double result=sum/2;
		return result;
	}
	
	void execute() {
		double result= avg(7,10);
		println("������: "+result);
		
	}
	void println(String message) { //���� ������(���ڿ�)+result(int)��ġ�� ���ڿ��̶� String�� ��.
		System.out.println(message);
	}
}
