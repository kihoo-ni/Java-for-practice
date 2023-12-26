package sec03.exam01;

public abstract class Animal {
	
	public String kind; //종류 
	
	public void breathe() { //메소드 
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); // 추상메소드 
}
