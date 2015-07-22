package Zadaci;

import java.util.Scanner;

public class Zadaci22Jul3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Enter size of arrays");
		int[] first = new int[input.nextInt()];
		int[] second = new int[first.length];

		System.out.println("Enter elements of  first array ");
		for (int i = 0; i < first.length; i++) {
			first[i] = input.nextInt();

		}

		System.out.println("Enter elements of second array");
		for (int j = 0; j < second.length; j++) {
			second[j] = input.nextInt();
		}

		System.out.println(equals(first, second));
	}

	public static boolean equals(int[] niz1, int[] niz2) {
		boolean result = false;

		for (int i = 0; i < niz1.length; i++) {
			if (niz1[i] != niz2[i]) {
				result = false;
				break;
			} else {
				result = true;
			}
		}

		return result;
	}

}
