package AvgustZadaci;

import java.util.Scanner;

public class Piramida {
	public static void printPiramidu(int broj) {                        // metoda za printanje piramide od nekog broja
		int numb = broj;                                      
		for (int i = 1; i < numb; i++) {                              // petlju pocinjemo od 1 pa sve do unesenog broja
			for (int j = 1; j < numb - i; j++) {                     // sledeci red takodje od 1 ali do pretposlednjeg broja
				System.out.print("  ");                             // na mjesto zadnjeg sada stavljamo razmak
			}
			 for (int k = i; k >= 1; k--) {                       //  petljom stampamo jednu stranu piramide ako su uslovi ispunjeni
				System.out.print((k >= 10) ? +k : " " + k);      //  i dodjeljujemo razmak u svakoj iteraciji
			}
			 for (int k = 2; k <= i; k++) {                    // ovom petljom stampamo drugu stranu piramide
				System.out.print((k >= 10) ? +k : " " + k);   // kada su uslovi ispunjeni
			}
			System.out.println(" ");                         // dodjeljujemo razmak ponovo u svakoj iteraciji

		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);                     // trazimo unos od korisnika

		System.out.println(" Unesite broj za ispis piramide: ");
		int broj = input.nextInt();                              // smjestamo unos od korisnika koji cemo proslijediti kao argument
		
		printPiramidu(broj);            // pozivanje prethodno kreirane metode koja ce ispisati piramidu

	}

}
