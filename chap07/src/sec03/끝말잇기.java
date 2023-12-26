package sec03;

import java.util.Scanner;

public class 끝말잇기 {

	

	Scanner s=new Scanner(System.in); 
	private String startWord = "아버지"; // 시작 단어
	private Player[] players; // 게임 참가자들
	

	public static void main(String[] args) {
		끝말잇기 game = new 끝말잇기();
		game.run();
	}

	// 게임을 진행하는 메소드
	public void run() {
		System.out.println("끝말잇기 게임을 시작합니다...");
		createPlayers(); // 참가자를 위한 Player []을 생성한다.
		String lastWord = startWord; // startWord에서 부터 시작한다.

		System.out.println("시작하는 단어는 " + lastWord + "입니다");
		int next = 0; // 참가자들의 순서대로 증가

		// 게임이 끝날 때까지 루프
		while (true) {
			String newWord = players[next].getWordFromUser(); 
			// next 참가자가 단어를 말하도록 한다.
			if (!players[next].checkSuccess(lastWord)) { // next 참가자가 성공하였는지 검사.
				System.out.print(players[next].getName() + "이 졌습니다.");
				break; // 게임을 종료한다.
			}
			next++; // 다음 참가자
			next %= players.length; // next가 참가자의 개수보다 많게 증가하는 것을 막는다.
			lastWord = newWord;
		}
	}

	// 게임 참가자 수를 입력받고 Player []을 생성하는 메소드
	private void createPlayers() {
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int nPlayers = s.nextInt();
		players = new Player[nPlayers]; // Player 클래스 타입의 배열 생성

		// 각 참여자의 이름을 입력받아 Player 객체 생성
		for (int i = 0; i < nPlayers; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			String name = s.next();
			players[i] = new Player(name);
		}
	}

}




