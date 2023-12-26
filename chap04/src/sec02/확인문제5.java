package sec02;

public class 확인문제5 {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) { // 전체반복횟수는 4회 ( 총4줄 출력)
			for(int j=1; j<=i; j++) {
				System.out.print("*"); //*를 옆으로 출력
			}
			System.out.println(); //줄변경
		}
	}

}
