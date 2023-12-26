package sec03;

import java.util.Scanner;

public class �����ձ� {

	

	Scanner s=new Scanner(System.in); 
	private String startWord = "�ƹ���"; // ���� �ܾ�
	private Player[] players; // ���� �����ڵ�
	

	public static void main(String[] args) {
		�����ձ� game = new �����ձ�();
		game.run();
	}

	// ������ �����ϴ� �޼ҵ�
	public void run() {
		System.out.println("�����ձ� ������ �����մϴ�...");
		createPlayers(); // �����ڸ� ���� Player []�� �����Ѵ�.
		String lastWord = startWord; // startWord���� ���� �����Ѵ�.

		System.out.println("�����ϴ� �ܾ�� " + lastWord + "�Դϴ�");
		int next = 0; // �����ڵ��� ������� ����

		// ������ ���� ������ ����
		while (true) {
			String newWord = players[next].getWordFromUser(); 
			// next �����ڰ� �ܾ ���ϵ��� �Ѵ�.
			if (!players[next].checkSuccess(lastWord)) { // next �����ڰ� �����Ͽ����� �˻�.
				System.out.print(players[next].getName() + "�� �����ϴ�.");
				break; // ������ �����Ѵ�.
			}
			next++; // ���� ������
			next %= players.length; // next�� �������� �������� ���� �����ϴ� ���� ���´�.
			lastWord = newWord;
		}
	}

	// ���� ������ ���� �Է¹ް� Player []�� �����ϴ� �޼ҵ�
	private void createPlayers() {
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int nPlayers = s.nextInt();
		players = new Player[nPlayers]; // Player Ŭ���� Ÿ���� �迭 ����

		// �� �������� �̸��� �Է¹޾� Player ��ü ����
		for (int i = 0; i < nPlayers; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			String name = s.next();
			players[i] = new Player(name);
		}
	}

}




