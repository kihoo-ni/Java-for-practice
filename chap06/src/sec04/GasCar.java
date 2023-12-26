package sec04;

public class GasCar {
	private int gas;
	
	void setGas(int gas) {
		this.gas=gas;
		System.out.println("gas가 "+gas+"만큼 충전 되었습니다.");
	}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("gas 잔량: "+gas);
				gas-=1;
			} else {
				System.out.println("gas 잔량: "+gas);
				return;
			}
		}
	}
}
