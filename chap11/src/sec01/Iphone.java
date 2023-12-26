package sec01;

public class Iphone {
	private String company;
	private int price;
	private String model;

	public Iphone(String company, int price, String model) {
		this.company = company;
		this.price = price;
		this.model = model;
	}

	@Override
	public String toString() {
		System.out.println("오브젝트의 투 스트링을 오버라이드 한 것입니다.");
		return company + "의 최신폰인 " + model + "의 가격은 " + price + "입니다.";
	}

}
