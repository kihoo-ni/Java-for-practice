package sec01;

public class Outter {
	String name = "홍길동";

	void reName() {
		System.out.println("홍길동 이름을 변경합니다.");
	}

	class Nested {
		String name = "장동건";

		void reName() {
			System.out.println("장동건 이름을 변경합니다.");
		}
		void print() {
			System.out.println(this.name);
			System.out.println(Outter.this.name);
		}
	}
}

