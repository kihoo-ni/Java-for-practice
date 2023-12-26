package sec02;

public class 배열2 {

	public static void main(String[] args) {
//	int []a; int a[]; 배열생성 방식 두가지 
		/*
		 * int[] a; int b[]; String c[]; int[]d= {1,2,3}; //배열 선언 및 대입
		 */
		/* 배열의 전체 합계와 평균을 구하세요. 평균은 double타입으로 for문 사용 */

		int[] d = { 51, 84, 93, 71, 65 };
		int sum = 0;
		for (int i = 0; i <= 4; i++) {
			sum += d[i];
		}
		System.out.println(sum);
		System.out.println((double)sum /  5);
		
		int[]t;
		/* t= {1,2,3}; 컴파일 에러 발생함
		 * 배열은 기본타입이 아니라 참조타입. 기본타입은 그냥 넣으면 되지만 참조타입은 new로 새로운것을 생성해야함.  */
		
		int[]s=null; // int[]s; 도 가능
		s=new int[] {1,2,3};
		int[]p=new int[] {1,2,3}; //한줄로 줄이면 이렇게함.
		int[]q= {4,5,6}; //더줄이면 이렇게함.
	}

}
