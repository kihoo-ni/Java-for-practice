package sec01;

import sec01.Outter.Nested;

public class OutterExample {

	public static void main(String[] args) {
		Outter outter= new Outter();
		Outter.Nested nested=outter.new Nested();
		nested.print();
		// Nested�� ���� ���� Ŭ������� ��� ȣ���ϴ°�?
		// Outter.Nested nested=new Outter.Nested();
	}

}


