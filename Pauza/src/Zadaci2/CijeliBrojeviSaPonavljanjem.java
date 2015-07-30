package Zadaci2;


import java.util.Scanner;

public class CijeliBrojeviSaPonavljanjem {

	public static void main(String[] args) {
		// Uzimamo potrebne podatke od korisnika sa tastature
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite koliko clanova ce imati vas niz unos je ogranicen na 100!: ");	  // uzimamo broj clanova niza	
		int clan = input.nextInt();

	    int[] niz = new int[clan];                                                                  // upisujemo clanove kao duzinu niza
		int brojac;
		System.out.println(" Unesite clanove niza 0 prekida unos: ");                           
		do {
			brojac = input.nextInt();                                                            // punimo niz od kosrisnika
			
			niz[brojac]++; 
			                                                                                   // brojimo svaki broj pri unosu
		   } while (brojac != 0);                                                             // sve dok broj nebude 0 

		for (int i = 1; i <= 101; i++) {                                                    // petljom prolazimo kroz sve brojeve
			                                                           
				System.out.println("Duplikat " + i + " se u ovom nizu ponavlja: " + niz[i]                  // ispis u konzoli
						+ " puta.");
			}
		}
	}

