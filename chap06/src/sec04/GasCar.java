package sec04;

public class GasCar {
	private int gas;
	
	void setGas(int gas) {
		this.gas=gas;
		System.out.println("gas�� "+gas+"��ŭ ���� �Ǿ����ϴ�.");
	}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("gas �ܷ�: "+gas);
				gas-=1;
			} else {
				System.out.println("gas �ܷ�: "+gas);
				return;
			}
		}
	}
}
