package Zadaci2;

import java.util.*;

public class ZbirRandomBrojeva {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Da ti su random brojevi");
		int odgovor;
		int broj1 = (int) (Math.random() * 100);    // random brojevi
		int broj2 = (int) (Math.random() * 100);
		int broj3 = (int) (Math.random() * 100);
		int zbir = broj1 + broj2 + broj3;          // iznos zbira tih random brojeva
		                                          // unos odgovora sa konzole pod uslovima
		do {
			System.out.println(" Izracunajte njihov zbir: " + broj1 + " + "
					+ broj2 + " + " + broj3 + " ?");
			odgovor = input.nextInt();

		} while (odgovor != zbir);    // sve dok odgovor nebude jednak zbiru
									 // postavljamo isto pitanje korisniku
									 // //petlja se izvrsava dok korisnik ne
									// unese tacan odgovor
		System.out.println("Cestitamo tacan odgovor!");     // ispis pozdravne poruke

	}
}
