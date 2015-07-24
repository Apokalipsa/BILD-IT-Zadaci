package Zadaci;

import java.util.Scanner;

public class ObrnutRedoslijedBrojeva {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] niz = new int[10]; // vec je poznato da ce niz imati 10 clanova tj
									// elemenata

		System.out.print("Unesite yeljene brojeve: ");

		for (int i = 0; i < niz.length; i++) { // upisujemo elemenate u niz
			niz[i] = input.nextInt();
			
		}

		for (int i = niz.length - 1; i >= 0; i--) { // obrnutom petljomvracamo
													// brojeve u obrnutom
													// redoslijedu
			System.out.print("Obrnut redoslijed vasih brojeva je: " + niz[i] + " ");
		}
	}
}