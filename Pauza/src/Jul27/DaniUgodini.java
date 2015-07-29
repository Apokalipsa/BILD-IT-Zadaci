package Jul27;

import java.util.Scanner;

public class DaniUgodini {
	public static boolean DaLiJePrestupna(int godina) {
		// Prvo provjeravamo da li je godina prestupna
		if (godina % 400 == 0 || godina % 4 == 0 && godina % 100 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void brojDanaUgodini(int prva, int zadnja) {

		for (int i = prva; i <= zadnja; i++) { // petljom prolazimo od prve
												// uneene do poslednje godine

			if (DaLiJePrestupna(i)) { // uslov za ispis ako je godina prestupna
				System.out.println("-->Godina " + i + " ima 366 dana.");

			} else {
				System.out.println("-->Godina " + i + " ima 365 dana."); // ispis ako nie prestupna
																			

			}
		}

	}

	public static void main(String[] args) {
		// unos osnovnih podataka od korisnika od koje do koje godine zeli
		// provjeru
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite prvu godinu za koju zelite provjeru: ");
		int prva = input.nextInt();

		System.out.print("Unesite krajnju godinu do koje zelite provjeru: ");
		int krajnja = input.nextInt();

		brojDanaUgodini(prva, krajnja); // pozivanje na prethodno definisanu metodu

										

	}
}
