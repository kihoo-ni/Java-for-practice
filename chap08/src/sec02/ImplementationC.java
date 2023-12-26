package sec02;

public class ImplementationC implements InterfaceC{

	@Override
	public void methodB() {
		System.out.println("메소드 B 실행");
	}

	@Override
	public void methodA() {
		System.out.println("메소드 A 실행");

	}

	@Override
	public void methodC() {
		System.out.println("메소드 C 실행");

	}
	
	public static void main(String [] args) {
		ImplementationC imple= new ImplementationC();
		
		InterfaceC ic =imple; //인터페이스C 객체인 ic는 A와 B의 모든 메소드 사용가능함.
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
	
}
