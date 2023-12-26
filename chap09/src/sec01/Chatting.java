package sec01;

public class Chatting {
	String nickName = null;

	void startChat(String chatId) {
		nickName = chatId;
		
		// String nickName =null; 오면 안됨.
		// class Chat은 로컬클래스라서 해당 클래스가 포함된 메소드의 필드는 기본적으로
		// final이 붙어서 반드시 값을 대입해야함.

		// inputData="어서오세요";
		// 로컬클래스의 메소드 안에 속한 필드는 해당 범위 안에서만 사용 가능함.
		class Chat {
			public void start() {
				while (true) {
					String inputData = "안녕하세요";
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
