package sec01;

public class Computer2 extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer2�� areaCircle() ����");
		return Math.PI * r * r;  // ���콺 ������ source override ����.
	}
}
