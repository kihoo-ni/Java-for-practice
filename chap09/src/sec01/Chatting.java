package sec01;

public class Chatting {
	String nickName = null;

	void startChat(String chatId) {
		nickName = chatId;
		
		// String nickName =null; ���� �ȵ�.
		// class Chat�� ����Ŭ������ �ش� Ŭ������ ���Ե� �޼ҵ��� �ʵ�� �⺻������
		// final�� �پ �ݵ�� ���� �����ؾ���.

		// inputData="�������";
		// ����Ŭ������ �޼ҵ� �ȿ� ���� �ʵ�� �ش� ���� �ȿ����� ��� ������.
		class Chat {
			public void start() {
				while (true) {
					String inputData = "�ȳ��ϼ���";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}

			void sendMessage(String message) {

			}
		}
		Chat chat = new Chat();
		chat.start();
	}
}
