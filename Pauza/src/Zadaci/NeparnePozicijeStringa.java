package Zadaci;

import java.util.Scanner;

public class NeparnePozicijeStringa {

	public static void main(String[] args) {
		// unos recenice od korisnika koja ce ispisati neparne pozicije
		// karaktera
		Scanner scan = new Scanner(System.in);
		System.out.println("Unesite Vasu recenicu:");

		String recenica = scan.nextLine();
		// smjestanje unosa od korisnika da se iscita
		Scanner neparnePozicije = new Scanner(recenica);
		while (neparnePozicije.hasNext()) {               // pdok god ima trazenih karaktera
			String text = neparnePozicije.next();         // pomocni string koji uzima
													     // karaktere iz vec unesenog
			for (int i = 0; i < text.length(); i++) {   // prolazak kroz sve
													   // karaktere
				if (i % 2 == 0) { // ukoliko je karakter jednak parnom broju
								// njega program izbacuje
					System.out.print(text.charAt(i)); // ispis karakreta koji
													 // nisu na pozicijama
													// parnog broja
				}
			}
			System.out.print(" ");
		}
	}
}
