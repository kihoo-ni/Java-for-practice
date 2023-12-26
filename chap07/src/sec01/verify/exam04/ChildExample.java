package sec01.verify.exam04;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child(); // parent에 종속된 child 클래스는 객체생성시 parent class 생성자를 먼저 불러옴
		// 따라서 child 생성자는 매개변수에따라 값이 다를 수 있지만 parent 클래스는 바뀌진 않는다.
		Parent parent = new Parent(); // parent 클래스로 불렀기때문에 parent class의 생성자를 소환한다.
	}

}
