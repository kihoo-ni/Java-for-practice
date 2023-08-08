package sec01;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

class Word {
	private String engWord; // 영단어
	private String korWord; // 한글단어

	// 생성자 영단어 한글단어 쌍으로 입력받음.
	public Word(String engWord, String korWord) {
		this.engWord = engWord;
		this.korWord = korWord;
	}

	// 영단어 리턴
	public String getEngWord() {
		return engWord;
	}

	// 한글단어 리턴
	public String getKorWord() {
		return korWord;
	}

}

public class WordQuiz {
	Scanner s = new Scanner(System.in);

	List<Word> list = new Vector<>();

	int[] question = new int[4]; // 문제 보기 저장할 배열은 4개

	public WordQuiz() { // 17개 단어 짝을 vector에 추가하는 생성자
		list.add(new Word("famous", "유명한"));
		list.add(new Word("hope", "희망"));
		list.add(new Word("important", "중요한"));
		list.add(new Word("law", "법"));
		list.add(new Word("income", "수입"));
		list.add(new Word("rule", "규칙"));
		list.add(new Word("save", "저장하다"));
		list.add(new Word("talk", "말하다"));
		list.add(new Word("sound", "소리"));
		list.add(new Word("volunteer", "자원봉사자"));
		list.add(new Word("throw", "던지다"));
		list.add(new Word("animal", "동물"));
		list.add(new Word("answer", "답하다"));
		list.add(new Word("believe", "믿다"));
		list.add(new Word("benefit", "헤택"));
		list.add(new Word("cover", "덮다"));
		list.add(new Word("damage", "손상"));

	}

	public void run() {
		System.out.println("누가 누가 잘 맞추나 게임을 시작합니다.");
		System.out.println("-1을 입력하면 종료합니다.");
		System.out.println("현재 " + list.size() + "개의 단어가 들어 있습니다.");
		System.out.println();

		int num = 0; // 맞춘 정답 갯수를 저장하는 변수

		while (true) {
			randomQuiz(); // 랜덤한 값을 가진 문제배열 생성 메소드 호출
			int answerNumber = (int) (Math.random() * question.length);
			// 0~3 중 한 값을 정답번호로 저장

			int answerIndex = question[answerNumber];
			// 정답번호의 배열에 있는 값이 정답

			System.out.println(list.get(answerIndex).getEngWord() + "?");
			// 정답의 영어단어를 호출해 문제로 출제함

			for (int i = 0; i < question.length; i++) {
				// 4개의 보기를 만들기 위한 반복문
				System.out.print("(" + (i + 1) + ")" + list.get(question[i]).getKorWord() + " ");
				// 0~3까지 배열에 값을 넣어 각 인덱스의 보기 출력
			}
			System.out.println(">> ");

			int input = s.nextInt();
			if (input == -1) {
				System.out.println("지금 까지 " + num + "개의 정답을 맞추었어요");
				System.out.println("게임을 종료합니다...");
				break;
			} else if (input - 1 == answerNumber) {
				// 입력한 값은 1~4 이므로
				System.out.println("정답이에요~ 잘했어요~");
				System.out.println();
				num++;
			} else {
				System.out.println("오답이에요~ 공부를 열심히");
				System.out.println();
			}
		}

	}

	public void randomQuiz() {
		// 4개의 보기에 임의의 벡터 인덱스를 주기 위한 메소드
		for (int i = 0; i < 4; i++) {
			question[i] = (int) (Math.random() * list.size());
			// 0~ 문제의 개수(벡터의 사이즈) 중 임의의 값을 저장
			for (int j = 0; j < i; j++) { // 중복된 값은 없도록 처리함
				if (question[i] == question[j]) {
					i--;
					continue;
				}
			}
		}
	}

	public static void main(String[] args) {
		WordQuiz wordQuiz = new WordQuiz();
		wordQuiz.run();
	}

}
