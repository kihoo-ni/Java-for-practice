package sec02.exam05;

public class PhoneExample {

	public static void main(String[] args) {
		// SmartPhone sp = new SmartPhone(); �ڽİ�ü�� �θ� ��ӹ޾Ƶ� �ڽİ�ä�� �����ϸ� �ڽĲ�(�ʵ�, �޼ҵ�)�� �����;���. ����ȯ�� ���þ���.
		Phone p = new SmartPhone(); // �ڽİ�ü�� �θ� ��ü�� Ÿ�Ժ�ȯ ��Ŵ (�ڵ���ȯ)
		System.out.println(p.cost);
		p.powerOn();
		p.ring(); // �������̵� �޼ҵ� ȣ��
		// p.videoOn(); �ڽ�Ŭ���� �޼ҵ�� ȣ�� �Ұ�.
		// p.phoneCase="�ϵ� ���̽�"; �ڽ�Ŭ���� �ʵ� ���Ұ�.
		
		SmartPhone sp=(SmartPhone)p; //�θ� ��ü�� �ڽ� ��ü�� ���� Ÿ�� ��ȯ ��Ŵ.
		sp.phoneCase="�ϵ� ���̽�"; //����Ÿ�Ժ�ȯ�߱� ������ SmartPhone Ŭ���� �ʵ尪 ���� ������
		sp.videoOn(); // ����Ÿ�Ժ�ȯ�߱� ������ SmartPhone Ŭ���� �޼ҵ� ���� ������
		sp.powerOn(); // �θ� ��ü �޼ҵ� ��밡��
		System.out.println(sp.cost); // �ڽİ�ü �ʵ尪 ���
		
		// Phone p2=new Phone(); 
		//Smartphone sp2 =(Smartphone)p2;
		// �ڽ�Ÿ���� �θ�Ÿ������ �ڵ���ȯ ���°� �ƴҰ�� �θ�Ÿ���� �ڽ�Ÿ������ ���� ����ȯ ���� ����.
	}

}
