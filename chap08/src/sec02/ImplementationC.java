package sec02;

public class ImplementationC implements InterfaceC{

	@Override
	public void methodB() {
		System.out.println("�޼ҵ� B ����");
	}

	@Override
	public void methodA() {
		System.out.println("�޼ҵ� A ����");

	}

	@Override
	public void methodC() {
		System.out.println("�޼ҵ� C ����");

	}
	
	public static void main(String [] args) {
		ImplementationC imple= new ImplementationC();
		
		InterfaceC ic =imple; //�������̽�C ��ü�� ic�� A�� B�� ��� �޼ҵ� ��밡����.
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
	
}
