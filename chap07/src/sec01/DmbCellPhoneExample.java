package sec01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10); //�θ���� �������� �ڽĻ����� ������.

		// ��ӹ��� �ʵ�
		System.out.println("��: " + dmbCellPhone.model);
		System.out.println("����: " + dmbCellPhone.color);

		// DmbCellPhone �ʵ� ���
		System.out.println("ä��: " + dmbCellPhone.channel);

		dmbCellPhone.turnOnDmb(); // DmbCellPhone �޼ҵ� ���

		dmbCellPhone.bell(); // ��ӹ��� �޼ҵ� ���
	}

}
