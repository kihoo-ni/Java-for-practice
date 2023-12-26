package sec02.exam04;

import java.util.Scanner;

public class 문자연습2 {

	public static void main(String[] args) {
		String name = "장동건";
		String job = "배우";
		System.out.println(name + "은 " + job + "입니다.");

		String str = "나는\"자바\"를 좋아합니다.";
		// String str = "나는 "자바"를 좋아합니다."; (x)
		System.out.println(str);

		String str2 = "번호\t이름\t나이";
		System.out.println(str2);
		String str4 = "번호\r이름\r나이";
		System.out.println(str4);
		String str3 = "번호\n이름\n나이"; //r,n같은 줄바꿈
		System.out.println(str3);

		System.out.println("행 단위 출력\n");
		System.out.println("행 단위 출력");

	}

}
