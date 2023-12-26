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
		String result = ssd + "의 ssd로 교체합니다.";
		return result;
	}

	void mouseOn() {
		System.out.println("마우스를 연결합니다.");
	}

	void mouseOff() {
		System.out.println("마우스를 연결을 해지합니다.");
	}

	void wifiSearch(String place) {
		System.out.println("와이파이가 있는곳은 " + place + "입니다.");
	}

	void wifiOn() {
		System.out.println("wifi on");
	}

	void wifiOff() {
		System.out.println("wifi off");
	}

	public String getGraphicCard() {
		System.out.println("현재 그래픽카드: " + graphicCard);
		return graphicCard;
	}

	public void setGraphicCard(String graphicCard) {
		System.out.println("그래픽카드를 " + graphicCard + "로 교체합니다.");
		this.graphicCard = graphicCard;
	}

}
