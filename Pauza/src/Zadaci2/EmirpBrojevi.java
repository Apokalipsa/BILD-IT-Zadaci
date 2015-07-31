package Zadaci2;

import java.io.IOException;
import java.util.Scanner;

public class EmirpBrojevi {
	public static void main(String[] args) throws IOException {
		int emrips = 100;            // promenljiva za smjestanje emrips broja
		int counter = 1;           // brojac poocu kojeg cemo kontrolisati koliko zelimo da ispisemo brojeva

		for (int i = 2; (counter < 101); i++) {              // petljom prolazimo od 2 broja pa sve do potrebnih 100
			if ((isPrime(i)) && (isPrime(reverse(i)))) {    // provjeravamo da li su prosti i da li su ispisani obrnuto
				System.out.print(i + " ");                 // pomocu prethodno kreiranih metoda
				//System.out.print( reverse(i));
				if (counter % 10 == 0) {                 // kada brojac dostigne 10 cifara prelazi stampanje novih u novi red
					System.out.println();
				}

				if (counter == emrips) {             // kada se broj izbrojanih cifara izjednaci sa 100 trazenih uslov je ispunjen
					break;
				}
				counter++;                         // isprintamo sve dobijene brojeve
			}
		}
	}

	public static boolean isPrime(int number) { // metoda koja provjerava je li broj prost
												 
		for (int i = 2; i < number; i++) { // prost je djeljiv sa 1 i sam sa sobom zato petlja krece od broja 2
																			 
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int reverse(int broj) {            // metoda koja vraca brojeve unazad

		int rezultat = 0;
		
		while (broj > 0) {

	   rezultat = 10 * rezultat +broj % 10;      // poslednji broj od obrnutog
		broj= broj / 10;                        //   dobijamo zadnji broj od unesenog tj prvi broj obrnutog
		}

		
		return rezultat;
	}
}
