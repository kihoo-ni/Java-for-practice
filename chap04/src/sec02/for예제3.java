package sec02;

public class for����3 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) { // int i=0; i<=100; i+=3 �̷��� �����ص� ��. 
			if (i % 3 == 0) {
				sum += i; //sum = sum + i; 
			}
		}
		System.out.println("1~100���� 3�� ����� �հ�: " + sum);
	}

}
