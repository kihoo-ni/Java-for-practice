package sec02.exam01;

public class 리터럴연습2 {

	public static void main(String[] args) {
		byte var1 = 115;
		byte var2 = 0;
		//byte var3 = 128; // byte 수 범위를 벗어남. -128~127

		System.out.println(var1);
		System.out.println(var2);
		//System.out.println(var3);

		long var4 = 12345678l;
		//long var5 = 1000000000000; // l 붙이기 아니면 int 범위 아래로
		long var6 = 1000000000000l;

		System.out.println(var4);
		// System.out.println(var5);
		System.out.println(var6);

	}

}
