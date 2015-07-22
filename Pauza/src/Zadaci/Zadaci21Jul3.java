package Zadaci;

import java.io.File;
import java.util.Scanner;

public class Zadaci21Jul3 {
	public static void main(String[] args) throws Exception {

		File file = new File("Dejan.txt"); // kreiranje filea
		Scanner input = new Scanner(file); // citanje iz filea

		int brojKaraktera = 0;
		int brojLinija = 0;
		int brojRijeci = 0;

		while (input.hasNext()) { // Izracunavanje broja karaktera

			String text = input.nextLine();
			String repAll = text.replaceAll(" ", ""); // uklanjanje svih razmaka
			brojKaraktera += repAll.length();

			// Number of words
			brojRijeci += text.split(" ").length; // Izracunavanje broja rijeci

			// Izracunavanje broja linija teksta
			brojLinija++;
		}

		System.out.println("broj karaktera: " + brojKaraktera);
		System.out.println("Broj linija: " + brojLinija);
		System.out.println("Broj rijeci: " + brojRijeci);

	}
}