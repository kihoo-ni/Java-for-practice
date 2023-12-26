package sec01;

import java.util.Scanner;

public class ReplaceExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("林家甫 涝仿窍技夸");
		String address = s.nextLine();
		String newAddress = address.replace("堡林", "堡林堡开矫");
		System.out.println(address);
		System.out.println(newAddress);
		
	}

}
