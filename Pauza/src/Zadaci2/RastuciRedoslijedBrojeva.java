package Zadaci2;

import java.awt.List;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RastuciRedoslijedBrojeva {
	
	public static int[] numberSort(int... arguments) {   // metoda kada neznamo koliko tacno ce korisnik unijeti brojeva 

		Arrays.sort(arguments);                   // koristimo ovu javinu klasu sortiraj niz

		return arguments;                        // vrati sortirane argumente

	}



	public static void main(String[] args) {
		                                                              // Trazimo unos brojeva od korisnika
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Unesite prvi broj");
		int prvi = input.nextInt();
		
		System.out.println(" Unesite drugi broj");
		int drugi = input.nextInt();
		
		System.out.println(" Unesite treci broj");
		int treci = input.nextInt();

		ArrayList<Integer> arraylista = new ArrayList<Integer>();         // smjestamo unijete brojeve u listu Integera
		arraylista.add(prvi);                                           
		arraylista.add(drugi);                                           
		arraylista.add(treci);                                          //  dodajemo unos koliko ga ima

		
		System.out.println("Uneseni brojevi prije sortiranja su:");
		for (int brojevi : arraylista) {                             // for each petljom printamo unesene brojeve
			System.out.println(brojevi);
		}

		
		Collections.sort(arraylista);                              // koristimo java colekciju da sortira unesene brojeve 

		
		System.out.println("Sortirani brojevi su:");
		for (int elementi : arraylista) {                       //  ponovo for each petljom printamo sortirane brojeve
			System.out.println(elementi);
		}
	}
}
