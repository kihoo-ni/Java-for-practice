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
		System.out.println("������Ʈ�� �� ��Ʈ���� �������̵� �� ���Դϴ�.");
		return company + "�� �ֽ����� " + model + "�� ������ " + price + "�Դϴ�.";
	}

}
