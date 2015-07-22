package Zadaci;

import java.util.Scanner;

public class Zadaci22Jul1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.print("Unesite pocetni i krajnji broj za ispis prostih brojeva u konzolu"
						+ "\ni unesite broj koji odredjuje ispis prostih brojeva po liniji: ");
		int pocetni = input.nextInt();
		int krajnji = input.nextInt();
		int brojPoLiniji = input.nextInt();

		System.out.println("Prvih " + krajnji + " prostih brojeva su: ");
		ispisProstih(pocetni, krajnji, brojPoLiniji);
		input.close();
	}

	public static void ispisProstih(int pocetni, int krajnji, int brojPoLiniji) {

		int brojac = 0;
		for (int broj = pocetni; broj <= krajnji; broj++) {
			if (prostiBroj(broj)) {
				brojac++;
				if (brojac % brojPoLiniji == 0) {
					System.out.println(broj + " ");
				} else {
					System.out.print(broj + " ");
				}
			}
		}
	}

	public static boolean prostiBroj(int broj) {

		int brojac = 0;
		int djelioc = 1;

		while (djelioc <= broj) {
			if (broj % djelioc == 0) {
				brojac++;
			}
			djelioc++;
		}
		return (brojac == 2);
	}
}
