package codeup.basic100;

import java.util.Scanner;

public class _1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;

		str = sc.nextLine();
		System.out.println(Integer.parseInt(str.split(":")[1]));
	}
}
