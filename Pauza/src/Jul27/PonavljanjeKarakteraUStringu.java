package Jul27;

import java.util.Scanner;

public class PonavljanjeKarakteraUStringu {
	public static int countCarakters(String str, char a) {
		int brojac = 0; 
		for (int i = 0; i < str.length(); i++) {  // prolazak petljom kroz sve karaktere u stringu

			if (str.charAt(i) == a) { // uslov ukoliko dati string sadrzi trazni karakter prinaj
				brojac++;             // svaku iteraciju istih sabiramo
			}
		}
		return brojac; // vracamo sabrane karaktere
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite recenicu za provjeru: ");
		String recenica = input.next();

		System.out.print("Unesite karakter za provjeru: ");

		char karakter = input.next().charAt(0); // da nebi doslo do propustanja karaktera stavimo  unos da na pocetnu poziciju

		System.out.println("Trazeni karakter " + karakter
				+ " se u Vasoj recenici ponovlja" + countCarakters(recenica, karakter)
				+ " puta.");

	}

}
