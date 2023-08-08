package sec01;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

class Word {
	private String engWord; // ���ܾ�
	private String korWord; // �ѱ۴ܾ�

	// ������ ���ܾ� �ѱ۴ܾ� ������ �Է¹���.
	public Word(String engWord, String korWord) {
		this.engWord = engWord;
		this.korWord = korWord;
	}

	// ���ܾ� ����
	public String getEngWord() {
		return engWord;
	}

	// �ѱ۴ܾ� ����
	public String getKorWord() {
		return korWord;
	}

}

public class WordQuiz {
	Scanner s = new Scanner(System.in);

	List<Word> list = new Vector<>();

	int[] question = new int[4]; // ���� ���� ������ �迭�� 4��

	public WordQuiz() { // 17�� �ܾ� ¦�� vector�� �߰��ϴ� ������
		list.add(new Word("famous", "������"));
		list.add(new Word("hope", "���"));
		list.add(new Word("important", "�߿���"));
		list.add(new Word("law", "��"));
		list.add(new Word("income", "����"));
		list.add(new Word("rule", "��Ģ"));
		list.add(new Word("save", "�����ϴ�"));
		list.add(new Word("talk", "���ϴ�"));
		list.add(new Word("sound", "�Ҹ�"));
		list.add(new Word("volunteer", "�ڿ�������"));
		list.add(new Word("throw", "������"));
		list.add(new Word("animal", "����"));
		list.add(new Word("answer", "���ϴ�"));
		list.add(new Word("believe", "�ϴ�"));
		list.add(new Word("benefit", "����"));
		list.add(new Word("cover", "����"));
		list.add(new Word("damage", "�ջ�"));

	}

	public void run() {
		System.out.println("���� ���� �� ���߳� ������ �����մϴ�.");
		System.out.println("-1�� �Է��ϸ� �����մϴ�.");
		System.out.println("���� " + list.size() + "���� �ܾ ��� �ֽ��ϴ�.");
		System.out.println();

		int num = 0; // ���� ���� ������ �����ϴ� ����

		while (true) {
			randomQuiz(); // ������ ���� ���� �����迭 ���� �޼ҵ� ȣ��
			int answerNumber = (int) (Math.random() * question.length);
			// 0~3 �� �� ���� �����ȣ�� ����

			int answerIndex = question[answerNumber];
			// �����ȣ�� �迭�� �ִ� ���� ����

			System.out.println(list.get(answerIndex).getEngWord() + "?");
			// ������ ����ܾ ȣ���� ������ ������

			for (int i = 0; i < question.length; i++) {
				// 4���� ���⸦ ����� ���� �ݺ���
				System.out.print("(" + (i + 1) + ")" + list.get(question[i]).getKorWord() + " ");
				// 0~3���� �迭�� ���� �־� �� �ε����� ���� ���
			}
			System.out.println(">> ");

			int input = s.nextInt();
			if (input == -1) {
				System.out.println("���� ���� " + num + "���� ������ ���߾����");
				System.out.println("������ �����մϴ�...");
				break;
			} else if (input - 1 == answerNumber) {
				// �Է��� ���� 1~4 �̹Ƿ�
				System.out.println("�����̿���~ ���߾��~");
				System.out.println();
				num++;
			} else {
				System.out.println("�����̿���~ ���θ� ������");
				System.out.println();
			}
		}

	}

	public void randomQuiz() {
		// 4���� ���⿡ ������ ���� �ε����� �ֱ� ���� �޼ҵ�
		for (int i = 0; i < 4; i++) {
			question[i] = (int) (Math.random() * list.size());
			// 0~ ������ ����(������ ������) �� ������ ���� ����
			for (int j = 0; j < i; j++) { // �ߺ��� ���� ������ ó����
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
