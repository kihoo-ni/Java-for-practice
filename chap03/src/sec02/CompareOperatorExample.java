package sec02;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // int와 double 비교시 int double로 바뀜.
		System.out.println(v2);

		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // 서로 같은 값으로 변환되지만 소숫점 자리수가 달라서 다름.
		System.out.println((float) v4 == v5);
		
	}

}
