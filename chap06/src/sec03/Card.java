package sec03;

public class Card {

	private String cardName; // private는 해당클래스에서만 사용가능.

	public Card() {
		this("현대");
	}

	public Card(String cardName) {
		this.cardName = cardName;
	}

	public void getCard() {
		System.out.println("카드사는 " + this.cardName + "입니다.");
	}

	public static void main(String[] args) {
		Card card1 = new Card();
		Card card2 = new Card("삼성");

		card1.getCard();
		card2.getCard();
	}

}
