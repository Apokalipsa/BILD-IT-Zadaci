package Zadaci;

import java.util.ArrayList;
import java.util.Collections;

public class Zadaci20Jul1 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>(); // kreiranje liste
														// Integera
		// lista.isEmpty(); kreirana je prazna lista
		lista.add(20);
		lista.add(2);
		lista.add(33); // dodavanje vrijednosti u listu
		lista.add(12);
		lista.add(36);
		lista.add(4);
		System.out.println(max(lista)); // pozivanje prethodno kreirane metode
										// koja vraca max od unesenih
										// vrijednosti

	}

	public static Integer max(ArrayList<Integer> list) {
		if (list.isEmpty()) { // ukoliko je lista prazna uslov
			return null; // vracanje vrijednosti iy prethodnog uslova
		}
		int maximum = Collections.max(list); // pronalazak max vrijednosti u
												// listi pomocu max collekshena
		return maximum;

	}

}
