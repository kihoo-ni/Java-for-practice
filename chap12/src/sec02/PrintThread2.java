package sec02;

public class PrintThread2 extends Thread {

	/*
	 * @Override public void run() { try { while(true) { System.out.println("���� ��");
	 * Thread.sleep(1); }
	 * 
	 * } catch (InterruptedException e) { System.out.println("���ͷ�Ʈ ���� �߻�"); }
	 * System.out.println("�ڿ� ����"); System.out.println("���� ����"); }
	 */

	@Override
	public void run() {
		while (true) {
			System.out.println("���� ��");
			if (Thread.interrupted()) { // this.isInterrupted() �޼ҵ� ���
				break;
			}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
