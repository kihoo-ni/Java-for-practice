package sec02;

public class KumhoTire extends Tire {

	// �θ� Ŭ���� ������ ȣ��
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// �޼ҵ� �Ű�����x, ����Ÿ�� boolean
	//������ �������̵� ������ �ν���.
	@Override 
	public boolean roll() {
		++accumulatedRotation; // ����ȸ���� 1�� ����
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false;
		}
	}

}
