package codeup.basic100;

import java.util.Scanner;

public class _1071 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		stopIfZeroEntered();
	}

	static void stopIfZeroEntered() {
		int n = sc.nextInt();
		if (n != 0) {
			System.out.println(n);
			stopIfZeroEntered();
		}
	}
}
