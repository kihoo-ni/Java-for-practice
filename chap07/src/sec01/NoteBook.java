package sec01;

public class NoteBook extends Computer {
	String cpu;
	String ssd;
	String graphicCard;
	String wifi;
	String modelName;
	String keyBoard;

	public NoteBook(String maker, String price, String graphicCard) {
		this.maker = maker;
		this.price = price;
		this.graphicCard = graphicCard;
	}

	String ssdExchange(String ssd) {
		String result = ssd + "�� ssd�� ��ü�մϴ�.";
		return result;
	}

	void mouseOn() {
		System.out.println("���콺�� �����մϴ�.");
	}

	void mouseOff() {
		System.out.println("���콺�� ������ �����մϴ�.");
	}

	void wifiSearch(String place) {
		System.out.println("�������̰� �ִ°��� " + place + "�Դϴ�.");
	}

	void wifiOn() {
		System.out.println("wifi on");
	}

	void wifiOff() {
		System.out.println("wifi off");
	}

	public String getGraphicCard() {
		System.out.println("���� �׷���ī��: " + graphicCard);
		return graphicCard;
	}

	public void setGraphicCard(String graphicCard) {
		System.out.println("�׷���ī�带 " + graphicCard + "�� ��ü�մϴ�.");
		this.graphicCard = graphicCard;
	}

}
