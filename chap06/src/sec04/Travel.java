package sec04;

public class Travel {

	private int oil;
	private String location;

	public int getOil() { //메소드
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}
	

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	void oilMinus(int x) {
		oil-= x;
	}

	boolean isOilLeft() {
		if (oil <= 0) {
			System.out.println("휘발유가 없어요. 여행을 종료하세요.");
			return false;
		} else {
			System.out.println("휘발유가 남았어요. 계속 여행하세요.");
			return true;
		}
	}

}
