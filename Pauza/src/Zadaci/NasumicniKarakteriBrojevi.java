package Zadaci;

public class NasumicniKarakteriBrojevi {
	public static void stoBrojeva() {
		// 100 nasumicnih brojeva
		for (int brojevi = 0; brojevi < 100; brojevi++) {// prolazak petljom
															// kroz
			if (brojevi % 10 == 0) { // uslov za prelazak stampanja u novi red
				System.out.println();
			}
			int broj = (int) (Math.random() * 10); // dodjeljujemo brojevima
													// nasumicne vrijednost
													// metodom random
			System.out.print(broj + " "); // printamo brojeve

		}

	}

	public static void stoKaraktera() {
		// 100 nasumicnih karaktera
		String karakteri = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // svi uppercase
															// karakteri u 1
															// nizu tipa String

		for (int slova = 0; slova < 100; slova++) {
			if (slova % 10 == 0) { // uslov za ispis u novi red
				System.out.println();
			}
			char slovo = karakteri.charAt((char) (Math.random() * 26)); // dodjeljivanje
																		// nasumicne
																		// vrijednosti
																		// svakom
																		// karakteru
																		// u
																		// svakoj
																		// iteraciji

			System.out.print(slovo + " "); // printamo karaktere

		}

	}

	public static void main(String[] args) {
		stoBrojeva(); // pozivamo se na prethodno kreirane metode
		stoKaraktera();
	}
}
