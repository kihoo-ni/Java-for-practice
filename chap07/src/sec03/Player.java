package sec03;

import java.util.Scanner;

//�� ����� �����ڸ� ǥ���ϴ� Ŭ����

	class Player {
		private Scanner scanner=new Scanner(System.in); // Ű���� �Է�
		private String name; // ���� �������� �̸�
		private String word; // �����ڰ� ���� �ܾ�
		
		public Player(String name) {
			 

			this.name = name;
		}

		public String getName() {
			return name;
		}

		public String getWordFromUser() {
			System.out.print(name + ">>");
			word = scanner.next();
			return word;
		}

		// lastWord�� �����ڰ� ���� word�� ���Ͽ� �����ձⰡ �ߵǾ����� �Ǵ�.
		// �����Ͽ����� true ����
		public boolean checkSuccess(String lastWord) {
			int lastIndex = lastWord.length() - 1; // ���� �ܾ��� �� ������ ������ �ε���

			// ���� �ܾ��� �� ������ ���ڿ� �����ڰ� ���� �ܾ��� ù ���ڰ� ������ ��
			if (lastWord.charAt(lastIndex) == word.charAt(0))
				return true;
			else
				return false;
		}

}
	
	
	
	
	
	
	
	
	
	
	
	
	