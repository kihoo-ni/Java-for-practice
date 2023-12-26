package sec01;

import sec01.Outter.Nested;

public class OutterExample {

	public static void main(String[] args) {
		Outter outter= new Outter();
		Outter.Nested nested=outter.new Nested();
		nested.print();
		// Nested가 만약 정적 클래스라면 어떻게 호출하는가?
		// Outter.Nested nested=new Outter.Nested();
	}

}


