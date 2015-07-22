package Zadaci;

import java.util.Scanner;

public class Zadadi20Jul5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Broj clanova niza ");
		int clan = input.nextInt();

		int niz[] = new int[clan];
		System.out.println("Ucitaj clanove niza:");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(i + "-->");
			niz[i] = input.nextInt();
			if (niz[i] == 0) { // ukoliko je uneseni broj 0 prekida se unos
				break;
			}
		}
		int max = niz[0]; // postavljamo max na pocetnu poziciju u nizu
		System.out.print("niz: ");
		for (int i = 0; i < niz.length; i++)
			System.out.print(niz[i] + " "); // ispis svih unijetih clanova niza

		// Postupak trazenja maksimuma
		for (int i = 1; i < niz.length; i++) {
			if (max < niz[i])
				max = niz[i];
		}
		System.out.println("\nNajveci clan niza je " + max);
	}
}
