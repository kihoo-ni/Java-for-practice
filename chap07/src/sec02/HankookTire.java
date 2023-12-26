package sec02;

public class HankookTire extends Tire {

	// �θ� Ŭ���� ������ ȣ��
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// �޼ҵ� �Ű�����x, ����Ÿ�� boolean
	// ������ �������̵� ������ �ν���.
	@Override
	public boolean roll() {
		++accumulatedRotation; // ����ȸ���� 1�� ����
		if (accumulatedRotation < maxRotation) {

			System.out.println(location + "HankookTire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false;
		}
	}

}
