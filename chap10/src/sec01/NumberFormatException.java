package sec01;

public class NumberFormatException {

	public static void main(String[] args) {
		String num1 = "100";
		int num2 = Integer.parseInt(num1);
		System.out.println(num2);

		String num3 = "°¡³ª´Ù";
		int num4 = Integer.parseInt(num3);
		System.out.println(num4);
	}

}
