package sec01;

public class NoteBookExample {

	public static void main(String[] args) {
		NoteBook macbook = new NoteBook("apple", "2000000", "rtx4070");
		macbook.pcOn();
		macbook.mouseOn();
		macbook.wifiOn();
		macbook.internetOn();

		macbook.setGraphicCard("rtx3090");
		macbook.getGraphicCard();

		macbook.gameOn("�����ý��丮");
		macbook.gameOff();

		macbook.pcOff();

	}

}
