package Zadaci;

import java.util.Scanner;

public class Zadaci22Jul2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ispisati najmanji clan u nizu");
		int niz[] = new int[20];

		System.out.println("Ucitaj clanove niza:");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(i + "-->");
			niz[i] = input.nextInt(); // ucitaj niz[i] - i-ti clan niza
		}

		int min = niz[0];
		for (int i = 1; i < niz.length; i++) {

			if (min > niz[i])
				min = niz[i];
		}

		System.out.println("Najmanji clan niza je: " + min);
	}
}
