package sec02.exam04;

public class 실수연습 {

	public static void main(String[] args) {
		// float var1 = 3.14;
		float var1 = 3.14f;

		double var2 = 3.14;
		System.out.println(var1);
		System.out.println(var2);

		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;

		System.out.println(var4);
		System.out.println(var5);

		float var6 = 0.1234567810123456789f;
		System.out.println(var6); // 정해진 범위 넘으면 반올림

		double var7 = 3e6;
		float var8 = 3e6f;
		double var9 = 2e-3;
		double var10 = 237e-4;

		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		System.out.println(var10);

		
		
	}

}
