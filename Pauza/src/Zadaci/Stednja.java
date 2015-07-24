package Zadaci;

import java.util.Scanner;

public class Stednja {

	public static void main(String[] args) {
		// Pitamo korisnika da unese stanje vezano za stednju
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj mjeseci: ");
		int mjeseci = input.nextInt();
		System.out.println("Unesite iznos koji cete da stedite: ");
		double iznos = input.nextDouble();
		double mjesecnaKamata = 0.05 / 12; // mjesecna kamata podijeljena sa 12
											// mj tj jednom godinom
		double sum = 0;
		for (int i = 0; i < mjeseci; i++) { // prolazimo petljom kroz sve
											// mjesece unesene sa konzole

			sum = (iznos + sum) * (1 + mjesecnaKamata); // kroz svaku uplatu
														// sabiranje sume
														// formula

		}
		System.out.println(" Stanje na vasem racunu nakon" + mjeseci
				+ " mjeseci ce iznositi: " + sum);

	}

}
