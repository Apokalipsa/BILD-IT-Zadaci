package Zadaci;


import java.util.Random;

public class SpilKarata {
	public static void main(String[] args) {

		Random rand = new Random(); // pozivamo se na random metodu jer nam
									// trebaju random brojevi
		// kreiramo string niz sa brojevima karata u spilu
		String[] brojKarte = { "As", "1", "2", "3", "4", "5", "6", "7",

		"8", "9", "10", "Kralj", "Joker", "Kraljica" };
		// kreiramo string niz sa tipom karata u spilu
		String[] tipKarte = { "Mak", "Srce", "Kocka", "List" };

		int brojac = 0;

		do { // prije nego provjerimo da li ima 52 karte radimo redanje karata

			int duzinaSpila = brojKarte.length;// duzina spila je tolika koliko
												// ima karata

			int brojIndexa = rand.nextInt(duzinaSpila);// broj rednog broja
														// karata je random

			String broj = brojKarte[brojIndexa];// pomocni string u koji
												// smjestamo broj koji dobijemo

			System.out.print(" Izvucena je karta sa brojem " + broj
					+ " u znaku ");// printamo taj broj

			int tipSpila = tipKarte.length;// kazemo da je tip spila jednak tipu
											// karata

			int tipIndexa = rand.nextInt(tipSpila); // a tip indexa je random iz
													// tipa naseg spila

			String tip = tipKarte[tipIndexa];// pomocni string koji prima
												// konacno tip karte i njen
												// redni broj u nizu

			System.out.print(tip + " ");// printamo taj tip

			brojac++;// pomocu brojaca obuhvatamo svih 52 karte u obradi

			System.out.println();

		} while (brojac < 52); // sve dok ima 52 karte

	}

}
