package sec02;

public class �ڵ�������1 {

	public static void main(String[] args) {
		Car myCar = new Car(); // Car ��ü���� �ν��Ͻ��� myCar

		System.out.println("����ȸ�� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);

		myCar.company = "���";
		myCar.model = "f40"; // ������ car class�� ����Ǿ��� �ʵ尪�� �ٲܼ� ����.
		System.out.println("������ ȸ�� : " + myCar.company);
		System.out.println("������ �𵨸� : " + myCar.model);
	}
}
